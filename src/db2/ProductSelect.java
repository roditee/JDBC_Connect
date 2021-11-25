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
				System.out.println("DB ���� ����!");
			}

			String sql = "select * from product order by prdNo";
			
			PreparedStatement pstmt = con.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery(sql);
			
			System.out.println("\n��ǰ ���� ��ȸ");
			System.out.println("��ǰ��ȣ \t\t ��ǰ�� \t\t\t ���� \t\t �귣�� \t\t ���� \t\tī�װ���ȣ");

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
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
	}
}
