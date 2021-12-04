package db8;

import java.util.Scanner;

public class StudentInsertdb8{
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 정보 등록");
		System.out.println("----------------------\n");
		
		System.out.print("학번 입력 : ");
		String stdNo = sc.nextLine();
		
		System.out.print("성명 입력 : ");
		String stdName = sc.nextLine();
		
		System.out.print("학년 입력 : ");
		int stdYear = Integer.parseInt(sc.nextLine());
		
		System.out.print("주소 입력 : ");
		String stdAddress = sc.nextLine();
		
		System.out.print("생년월일 입력 : ");
		String stdBirthday = sc.nextLine();
		
		System.out.print("학과번호 입력 : ");
		String dptNo = sc.nextLine();
		
		StudentDTOdb8 stdDTO = new StudentDTOdb8(stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
		StudentDAOdb8 stdDAO = new StudentDAOdb8();
		stdDAO.insertStudent(stdDTO);
		
		sc.close();
	}
}