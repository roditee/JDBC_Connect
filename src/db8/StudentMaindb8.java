package db8;

import java.util.Scanner;

public class StudentMaindb8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************************");
		System.out.println("     �л� ���� ���α׷�");
		System.out.println("************************");
		System.out.println("     ���� �޴����� ����");
		System.out.println("************************");
		System.out.println("1. �л� ���");
		System.out.println("2. �л� ���� ��ȸ");
		System.out.println("3. �л� ���� ����");
		System.out.println("4. �л� ���� ����");
		System.out.println("5. ����");
		System.out.println("------------------------------------------");
		System.out.print("�޴� ��ȣ �Է� : ");
		int chioce = sc.nextInt();
		
		switch(chioce) {
		case 1 :
			StudentInsertdb8 stdInsert = new StudentInsertdb8();
			stdInsert.insert();
			break;
		case 2 :
			StudentSelectdb8 stdSelect = new StudentSelectdb8();
			stdSelect.select();
			break;
		case 3 :
			break;
		case 4 :
			break;
		case 5 :
			break;
		default :
			System.out.println("\n�߸� �Է��ϼ̽��ϴ�.");
	}
		System.out.println("------------------------------------------");
		System.out.println("����Ǿ����ϴ�.");
		System.out.println("------------------------------------------");
		sc.close();
	}
}
