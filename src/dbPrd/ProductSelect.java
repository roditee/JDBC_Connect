package dbPrd;

import java.util.ArrayList;

public class ProductSelect {
    public void productSelect() {
        ProductDAO productDAO = new ProductDAO();
        ArrayList<ProductDTO> dataSet = new ArrayList<ProductDTO>();
        dataSet = productDAO.selectProduct();
        for (ProductDTO dto : dataSet) {
            System.out.println(dto);
        }
    }
}