package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductUpdateEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 정보 수정");
		System.out.println("----------------------\n");
		
		System.out.print("수정할 상품번호 입력 : ");
		String prdNo = sc.nextLine();
		
		System.out.print("상품명 입력 : ");
		String prdName = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		int prdPrice = Integer.parseInt(sc.nextLine());
		
		System.out.print("브랜드 입력 : ");
		String prdMaker = sc.nextLine();
		
		System.out.print("색상 입력 : ");
		String prdColor = sc.nextLine();
		
		System.out.print("카테고리번호 입력 : ");
		String ctgNo = sc.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if (con != null) {
				System.out.println("DB 연결 성공!");
			}
		
		String sql = "update product set prdName=?, prdPrice=?, prdMaker=?, prdColor=?, ctgNo=? where prdNo=?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, prdName);
		pstmt.setInt(2, prdPrice);
		pstmt.setString(3, prdMaker);
		pstmt.setString(4, prdColor);
		pstmt.setString(5, ctgNo);
		pstmt.setString(6, prdNo);

		int result = pstmt.executeUpdate();
		
		if (result > 0) {
			System.out.println("데이터 수정 성공!");
		}
		
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
		
		sc.close();
	}

}
