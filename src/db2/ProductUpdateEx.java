package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductUpdateEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ǰ ���� ����");
		System.out.println("----------------------\n");
		
		System.out.print("������ ��ǰ��ȣ �Է� : ");
		String prdNo = sc.nextLine();
		
		System.out.print("��ǰ�� �Է� : ");
		String prdName = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		int prdPrice = Integer.parseInt(sc.nextLine());
		
		System.out.print("�귣�� �Է� : ");
		String prdMaker = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String prdColor = sc.nextLine();
		
		System.out.print("ī�װ���ȣ �Է� : ");
		String ctgNo = sc.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if (con != null) {
				System.out.println("DB ���� ����!");
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
			System.out.println("������ ���� ����!");
		}
		
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
		
		sc.close();
	}

}
