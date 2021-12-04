package db3;

//(1) 생성자에서 DB 연결
// 연산 기능은 메서드를 통해 구현
//(2) selectStudent() 메서드 : DB의 student 테이블에서 select한 결과 출력
//(3) insertStudent(StudentDTO dto) 메서드를 통해, main에서 입력한 student 데이터를 전달받아 테이블에 insert 작업 수행 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class StudentDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 생성자 : (1) DB 연결
	public StudentDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
			if (con != null) {
				System.out.println("DB 연결 성공!");
			}
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}
	
	// (2) selectStudent() 메서드
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
	
	// (3) insertStudent(StudentDTO dto) 메서드
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
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("데이터 입력 성공!");
			}
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
}
