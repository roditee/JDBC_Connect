package db4;

import java.util.Scanner;

public class ProductEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProductDAO prdDAO = new ProductDAO();
		
		System.out.println("��ǰ ���� ���");
		System.out.println("----------------------\n");
		
		System.out.print("��ǰ ��ȣ �Է� : ");
		String prdNo = sc.nextLine();
		
		System.out.print("��ǰ�� �Է� : ");
		String prdName = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		int prdPrice = Integer.parseInt(sc.nextLine());
		
		System.out.print("�귣�� �Է� : ");
		String prdMaker = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String prdColor = sc.nextLine();
		
		System.out.print("ī�װ� ��ȣ �Է� : ");
		String ctgNo = sc.nextLine();
		
		ProductDTO prdDTO = new ProductDTO(prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
		prdDAO.insertProduct(prdDTO);
		
		// (2) �л� ���� ��ȸ : StudentDAO Ŭ������ selectStudent() �޼��� ȣ��
		prdDAO.selectProduct();
		
		sc.close();
	}
}