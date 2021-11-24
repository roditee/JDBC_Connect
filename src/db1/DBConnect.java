package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnect {
	public static void main(String[] args) {
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
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
	}

}