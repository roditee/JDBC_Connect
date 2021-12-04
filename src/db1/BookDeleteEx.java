package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookDeleteEx {

	public static void main(String[] args) {
		// ������ ���� ��ȣ �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� ����");
		System.out.println("----------------------\n");
		
		System.out.print("������ ������ȣ �Է� : ");
		String bookNo = sc.next();
		
		// DB ����
		try {
			//JDBC ����̹� Ŭ������ ��ü ���� ��Ÿ�� �� �ε�
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
			
			// ���� ���� ����
			
			// SQL �ۼ� (update)
			// �Էµ� ������ ���� ��ȣ�� ã�� ����
			String sql = "delete from book where bookNo=?";
			
			// ������ ������ ���� PreparedStatement ��ü ����
			// Connection �������̽��� PrepareStatement() �޼ҵ� ����Ͽ� ��ü ����
			// sql������ �˻��� �� (?) ����
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookNo);
			
			// ���� ������ : ������ ���� ���� �� ��ȯ
			int result = pstmt.executeUpdate();
			
			// ��� ���
			if (result > 0) {
				System.out.println("������ ���� ����!");
			}
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
		// ���� ���� ����
		
		sc.close();
	}

}
