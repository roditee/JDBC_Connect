package db5;

import java.util.Scanner;

public class StudentUpdate {
	public void update() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� ���� ����");
		System.out.println("----------------------\n");
		
		System.out.print("������ �л��� �й� �Է� : ");
		String stdNo = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String stdName = sc.nextLine();
		
		System.out.print("�г� �Է� : ");
		int stdYear = Integer.parseInt(sc.nextLine());
		
		System.out.print("�ּ� �Է� : ");
		String stdAddress = sc.nextLine();
		
		System.out.print("������� �Է� : ");
		String stdBirthday = sc.nextLine();
		
		System.out.print("�а���ȣ �Է� : ");
		String dptNo = sc.nextLine();
		
		StudentDTO stdDTO = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
		StudentDAOdb5 stdDAO = new StudentDAOdb5();
		stdDAO.updateStudent(stdDTO);
		
		sc.close();
	}
}
