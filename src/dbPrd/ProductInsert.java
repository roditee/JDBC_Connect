package dbPrd;

import java.util.Scanner;

public class ProductInsert {
    public void productInsert() {

    Scanner scan = new Scanner(System.in);
    ProductDAO productDAO = new ProductDAO();

    System.out.print("��ǰ ��ȣ �Է� ");
    String prdNo = scan.nextLine();

    System.out.print("��ǰ�� �Է� ");
    String prdName = scan.nextLine();

    System.out.print("���� �Է� ");
    int prdPrice = scan.nextInt();
        scan.nextLine();

    System.out.print("������ �Է� ");
    String prdMaker = scan.nextLine();

    System.out.print("���� �Է� ");
    String prdColor = scan.nextLine();

    System.out.print("ī�װ� �Է� ");
    String ctgNo = scan.nextLine();

    ProductDTO productDTO =
            new ProductDTO(prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
    productDAO.insertProduct(productDTO);
    
    scan.close();
    }
}