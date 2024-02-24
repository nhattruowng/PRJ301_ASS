package src.java.obj;

public class Category {
    private int idtype;
    private String ProductType;

    public Category(int idtype, String productType) {
        this.idtype = idtype;
        ProductType = productType;
    }

    public int getIdtype() {
        return idtype;
    }

    public void setIdtype(int idtype) {
        this.idtype = idtype;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }
}
