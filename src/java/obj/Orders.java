package src.java.obj;

public class Orders {
    private int IdOrder;
    private int IdProduct;
    private int IdVoucher;
    private String OrderDateTime;
    private double Price;
    private double lastPrice;

    public Orders(int idOrder, int idProduct, int idVoucher, String orderDateTime, double price, double lastPrice) {
        IdOrder = idOrder;
        IdProduct = idProduct;
        IdVoucher = idVoucher;
        OrderDateTime = orderDateTime;
        Price = price;
        this.lastPrice = lastPrice;
    }

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int idOrder) {
        IdOrder = idOrder;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }

    public int getIdVoucher() {
        return IdVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        IdVoucher = idVoucher;
    }

    public String getOrderDateTime() {
        return OrderDateTime;
    }

    public void setOrderDateTime(String orderDateTime) {
        OrderDateTime = orderDateTime;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }
}
