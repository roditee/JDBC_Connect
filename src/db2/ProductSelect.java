package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class ProductSelect {
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

			String sql = "select * from product order by prdNo";
			
			PreparedStatement pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery(sql);
			
			System.out.println("\n상품 정보 조회");
			System.out.println("상품번호 \t\t 상품명 \t\t\t 가격 \t\t 브랜드 \t\t 색상 \t\t카테고리번호");

			while(rs.next()) {
				String prdNo = rs.getString(1);
				String prdName = rs.getString(2);	
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				String ctgNo = rs.getString(6);
				
				System.out.format("%-10s\t %-15s\t %-10d\t %-10s\t %-5s\t\t%-4s\n", prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
			}
			
			rs.close();
			pstmt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}
}
