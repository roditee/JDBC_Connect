package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";

			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if (con != null) {
				System.out.println("DB 연결 성공!");
			}
			
			String prdNo = "1016";
			String prdName = "삼성 Z플립";
			int prdPrice = 1400000;
			String prdMaker = "삼성전자";
			String prdColor = "라벤더";
			String ctgNo = "1";
			
			String sql = "insert into product values(?, ?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, prdNo);
			pstmt.setString(2, prdName);
			pstmt.setInt(3, prdPrice);
			pstmt.setString(4, prdMaker);
			pstmt.setString(5, prdColor);
			pstmt.setString(6, ctgNo);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("데이터 입력 성공!");
			}
			
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}
}