package db3;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// DAO ��ü ���� -> ������ ȣ�� -> DB ����
		StudentDAO stdDAO = new StudentDAO();
		
		// (1) �л� ������ �Է�
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
		
		// StudentDTO ��ü ���� -> ������ ���ÿ� �� ���� -> ������ ȣ�� -> �� ����
		StudentDTO stdDTO = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
		stdDAO.insertStudent(stdDTO);
		
		// (2) �л� ���� ��ȸ : StudentDAO Ŭ������ selectStudent() �޼��� ȣ��
		stdDAO.selectStudent();
	}
}
