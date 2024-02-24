package src.java.obj;

public class Product {
    private int IdProduct;
    private int IdShop;
    private int IdType;
    private int IdVoucher;
    private String NameProduct;
    private String Brand;
    private String DateOfManufacture;
    private String ExpirationDate;
    private double Price;
    private double Miscount;
    private int DiscountPerod;
    private boolean ProductExist;
    private byte[] ImageProduct;
    private String Details;

    public Product(int idProduct, int idShop, int idType, int idVoucher,
                   String nameProduct, String brand, String dateOfManufacture,
                   String expirationDate, double price, double miscount, int discountPerod,
                   boolean productExist, byte[] imageProduct, String details) {
        IdProduct = idProduct;
        IdShop = idShop;
        IdType = idType;
        IdVoucher = idVoucher;
        NameProduct = nameProduct;
        Brand = brand;
        DateOfManufacture = dateOfManufacture;
        ExpirationDate = expirationDate;
        Price = price;
        Miscount = miscount;
        DiscountPerod = discountPerod;
        ProductExist = productExist;
        ImageProduct = imageProduct;
        Details = details;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }

    public int getIdShop() {
        return IdShop;
    }

    public void setIdShop(int idShop) {
        IdShop = idShop;
    }

    public int getIdType() {
        return IdType;
    }

    public void setIdType(int idType) {
        IdType = idType;
    }

    public int getIdVoucher() {
        return IdVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        IdVoucher = idVoucher;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getDateOfManufacture() {
        return DateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        DateOfManufacture = dateOfManufacture;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getMiscount() {
        return Miscount;
    }

    public void setMiscount(double miscount) {
        Miscount = miscount;
    }

    public int getDiscountPerod() {
        return DiscountPerod;
    }

    public void setDiscountPerod(int discountPerod) {
        DiscountPerod = discountPerod;
    }

    public boolean isProductExist() {
        return ProductExist;
    }

    public void setProductExist(boolean productExist) {
        ProductExist = productExist;
    }

    public byte[] getImageProduct() {
        return ImageProduct;
    }

    public void setImageProduct(byte[] imageProduct) {
        ImageProduct = imageProduct;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

}
