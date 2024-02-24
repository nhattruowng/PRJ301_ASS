package src.java.obj;

public class Warehouse {
    private int IdAccount;
    private int IdProduct;
    private String DateAdded;
    private int quantity;

    public Warehouse(int idAccount, int idProduct, String dateAdded, int quantity) {
        IdAccount = idAccount;
        IdProduct = idProduct;
        DateAdded = dateAdded;
        this.quantity = quantity;
    }

    public int getIdAccount() {
        return IdAccount;
    }

    public void setIdAccount(int idAccount) {
        IdAccount = idAccount;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }

    public String getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(String dateAdded) {
        DateAdded = dateAdded;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
