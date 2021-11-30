package db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import db3.StudentDTO;

public class StudentDAOdb5 {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public StudentDAOdb5() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
	
	public void selectStudent() {
		try {
			String sql = "select * from student order by stdNo";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				String stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				Date stdBirthday = rs.getDate(5);
				String dptNo = rs.getString(6);
				
				System.out.format("%-10s\t %-10s\t %-4d %-20s %13s %5s\n",
						stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
	
	public void insertStudent(StudentDTO dto) {
		try {
			String sql = "insert into student values(?, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdNo());
			pstmt.setString(2, dto.getStdName());
			pstmt.setInt(3, dto.getStdYear());
			pstmt.setString(4, dto.getStdAddress());
			pstmt.setString(5, dto.getStdBirthDay());
			pstmt.setString(6, dto.getDptNo());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
	
	public void updateStudent(StudentDTO dto) {
		try {
			String sql = "update student set stdName=?, stdYear=?, stdAddress=?, stdBirthDay=?, dptNo=? where stdNo=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdName());
			pstmt.setInt(2, dto.getStdYear());
			pstmt.setString(3, dto.getStdAddress());
			pstmt.setString(4, dto.getStdBirthDay());
			pstmt.setString(5, dto.getDptNo());
			pstmt.setString(6, dto.getStdNo());
	
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("데이터 수정 성공!");
				}
			} catch (Exception e) {
				System.out.println("오류 발생!");
				e.printStackTrace();
				}
		}
	
	public void deleteStudent(String stdNo) {
		try {
			String sql = "delete from student where stdNo=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, stdNo);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("데이터 삭제 성공!");
			}
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}
}
