package db5;

import java.util.Scanner;

public class StudentMain {
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
			System.out.println("\n�߸� �Է��ϼ̽��ϴ�.");
	}
		System.out.println("------------------------------------------");
		System.out.println("����Ǿ����ϴ�.");
		System.out.println("------------------------------------------");
		
		sc.close();
	}
}
