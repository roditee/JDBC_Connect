package db8;

import java.util.Date;
import java.util.Scanner;

public class StudentInsert{
	
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
		
		StudentDTO stdDTO = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
		StudentDAO stdDAO = new StudentDAO();
		stdDAO.insertStudent(stdDTO);
		
	}
}