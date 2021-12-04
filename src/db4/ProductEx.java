package db4;

import java.util.Scanner;

public class ProductEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProductDAO prdDAO = new ProductDAO();
		
		System.out.println("상품 정보 등록");
		System.out.println("----------------------\n");
		
		System.out.print("상품 번호 입력 : ");
		String prdNo = sc.nextLine();
		
		System.out.print("상품명 입력 : ");
		String prdName = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		int prdPrice = Integer.parseInt(sc.nextLine());
		
		System.out.print("브랜드 입력 : ");
		String prdMaker = sc.nextLine();
		
		System.out.print("색상 입력 : ");
		String prdColor = sc.nextLine();
		
		System.out.print("카테고리 번호 입력 : ");
		String ctgNo = sc.nextLine();
		
		ProductDTO prdDTO = new ProductDTO(prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
		prdDAO.insertProduct(prdDTO);
		
		// (2) 학생 정보 조회 : StudentDAO 클래스의 selectStudent() 메서드 호출
		prdDAO.selectProduct();
		
		sc.close();
	}
}