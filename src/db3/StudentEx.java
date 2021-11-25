package db3;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// DAO 객체 생성 -> 생성자 호출 -> DB 연결
		StudentDAO stdDAO = new StudentDAO();
		
		// (1) 학생 데이터 입력
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
		
		// StudentDTO 객체 생성 -> 생성과 동시에 값 저장 -> 생성자 호출 -> 값 전달
		StudentDTO stdDTO = new StudentDTO(stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo);
		stdDAO.insertStudent(stdDTO);
		
		// (2) 학생 정보 조회 : StudentDAO 클래스의 selectStudent() 메서드 호출
		stdDAO.selectStudent();
	}
}
