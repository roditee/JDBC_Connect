package db5;

import java.util.Date;
import java.util.Scanner;

import db3.StudentDAO;
import db3.StudentDTO;

public class StudentInsert{
	
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
		
		StudentDTO stdDTO = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
		StudentDAOdb5 stdDAO = new StudentDAOdb5();
		stdDAO.insertStudent(stdDTO);
		
	}
}