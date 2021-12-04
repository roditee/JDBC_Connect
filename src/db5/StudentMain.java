package db5;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************************");
		System.out.println("     학생 관리 프로그램");
		System.out.println("************************");
		System.out.println("     다음 메뉴에서 선택");
		System.out.println("************************");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 정보 조회");
		System.out.println("3. 학생 정보 수정");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 종료");
		System.out.println("------------------------------------------");
		System.out.print("메뉴 번호 입력 : ");
		int chioce = sc.nextInt();
		
		switch(chioce) {
		case 1 :
			StudentInsert stdInsert = new StudentInsert();
			stdInsert.insert();
			break;
		case 2 :
			StudentSelect stdSelect = new StudentSelect();
			stdSelect.select();
			break;
		case 3 :
			StudentUpdate stdUpdate = new StudentUpdate();
			stdUpdate.update();
			break;
		case 4 :
			StudentDelete stdDelete = new StudentDelete();
			stdDelete.delete();
			break;
		case 5 :
			break;
		default :
			System.out.println("\n잘못 입력하셨습니다.");
	}
		System.out.println("------------------------------------------");
		System.out.println("종료되었습니다.");
		System.out.println("------------------------------------------");
		
		sc.close();
	}
}
