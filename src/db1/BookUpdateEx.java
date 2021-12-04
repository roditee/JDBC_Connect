package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookUpdateEx {
	public static void main(String[] args) {
		// �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� ����");
		System.out.println("----------------------\n");
		
		System.out.print("������ ������ȣ �Է� : ");
		String bookNo = sc.nextLine();
		
		System.out.print("������ �Է� : ");
		String bookName = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String bookAuthor = sc.nextLine();
		
		System.out.print("���� �Է� : ");
//		int bookPrice = sc.nextInt();
//		sc.nextLine();
		int bookPrice = Integer.parseInt(sc.nextLine());
		
		System.out.print("������ �Է� : ");
		String bookDate = sc.nextLine();
		
		System.out.print("��� �Է� : ");
//		int bookStock = sc.nextInt();
//		sc.nextLine();
		int bookStock = Integer.parseInt(sc.nextLine());
		
		System.out.print("���ǻ��ȣ �Է� : ");
		String pubNo = sc.nextLine();
		
		// DB ����
		try {
			// JDBC ����̹� �ε� (Properties-Java Build Path�� �߰��ص���)
			// JDBC ����̹� Ŭ������ ��ü ���� ��Ÿ�� �� �ε�
			// ��Ŭ���� ���� �� �ڵ� �ε� �����༭ ��� ������ �ڵ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//���� url �ּ�, ����� ����, �н����� ���ڿ� ���� ����
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			// DB ������ ���� ��ü ����
			// DriverManager�� ����  Connection ��ü ����
			//MySQL ���� ���� : �ּ�, ����� ����, �н����� ����
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			// Connection ��ü�� �����Ǹ� DB ���� ����
			if (con != null) {
				System.out.println("DB ���� ����!");
			}
		// DB ���� �Ϸ�
		
		// SQL �ۼ� (update)
		// �Էµ� ������ ���� ��ȣ�� ã�� �Էµ� ������ ����
		// ���� *** �⺻Ű ���� �Ұ��ϹǷ� bookNo�� set�� ����
		String sql = "update book set bookName=?, bookAuthor=?, bookPrice=?, bookDate=?, bookStock=?, pubNo=? where bookNo=?";
		
		// ������ ������ ���� PreparedStatement ��ü ����
		// Connection �������̽��� PrepareStatement() �޼ҵ� ����Ͽ� ��ü ����
		// sql������ ������ �� (?)�� ������ ������ ����
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bookName);
		pstmt.setString(2, bookAuthor);
		pstmt.setInt(3, bookPrice);
		pstmt.setString(4, bookDate);
		pstmt.setInt(5, bookStock);
		pstmt.setString(6, pubNo);
		pstmt.setString(7, bookNo);
		
		// ���� ������ : ������ ���� ���� �� ��ȯ
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
