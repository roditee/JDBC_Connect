package dbPrd;

public class ProductDTO {
    String prdNo;
    String prdName;
    int prdPrice;
    String prdMaker;
    String prdColor;
    String ctgNo;

    public ProductDTO(String prdNo, String prdName, int prdPrice, String prdMaker, String prdColor, String ctgNo) {
        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdMaker = prdMaker;
        this.prdColor = prdColor;
        this.ctgNo = ctgNo;
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public int getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(int prdPrice) {
        this.prdPrice = prdPrice;
    }

    public String getPrdMaker() {
        return prdMaker;
    }

    public void setPrdMaker(String prdMaker) {
        this.prdMaker = prdMaker;
    }

    public String getPrdColor() {
        return prdColor;
    }

    public void setPrdColor(String prdColor) {
        this.prdColor = prdColor;
    }

    public String getCtgNo() {
        return ctgNo;
    }

    public void setCtgNo(String ctgNo) {
        this.ctgNo = ctgNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(prdNo);
        sb.append("\t");
        sb.append(prdName);
        sb.append("\t");
        sb.append(prdPrice);
        sb.append("\t");
        sb.append(prdMaker);
        sb.append("\t");
        sb.append(prdColor);
        sb.append("\t");
        sb.append(ctgNo);
        return sb.toString();
    }
}
