package dbPrd;

import java.util.Scanner;

public class ProductEx {
	public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("\t ��ǰ ���� ���α׷�");
        System.out.println("---------------------------------------");
        System.out.println("\t �޴����� ����");
        System.out.println("---------------------------------------");
        System.out.println("1. ��ǰ ���");
        System.out.println("2. ��ǰ ���� ��ȸ");
        System.out.println("3. ��ǰ ���� ����");
        System.out.println("4. ��ǰ ���� ����");
        System.out.println("5. ����");
        System.out.println("---------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("������ �۾� ��ȣ �Է� : ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                ProductInsert productInsert = new ProductInsert();
                productInsert.productInsert();
                break;
            case 2:
                ProductSelect productSelect = new ProductSelect();
                productSelect.productSelect();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("�߸��� �Է�");
                break;
        }
    }
}
