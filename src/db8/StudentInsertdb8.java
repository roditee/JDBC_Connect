package db8;

import java.util.Scanner;

public class StudentInsertdb8{
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� ���� ���");
		System.out.println("----------------------\n");
		
		System.out.print("�й� �Է� : ");
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
		
		StudentDTOdb8 stdDTO = new StudentDTOdb8(stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
		StudentDAOdb8 stdDAO = new StudentDAOdb8();
		stdDAO.insertStudent(stdDTO);
		
		sc.close();
	}
}