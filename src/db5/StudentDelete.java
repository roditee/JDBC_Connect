package db5;

import java.util.Scanner;

public class StudentDelete {
	public void delete() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� ���� ����");
		System.out.println("----------------------\n");
		
		System.out.print("������ �л��� �й� �Է� : ");
		String stdNo = sc.next();
		
		StudentDAOdb5 stdDAO = new StudentDAOdb5();
		stdDAO.deleteStudent(stdNo);
		
		sc.close();
	}
}
