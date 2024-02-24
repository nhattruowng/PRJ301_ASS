package src.java.obj;

public class Shop {
    private int IdShop;
    private int IdAccount;
    private String Address;

    public Shop(int idShop, int idAccount, String address) {
        IdShop = idShop;
        IdAccount = idAccount;
        Address = address;
    }

    public int getIdShop() {
        return IdShop;
    }

    public void setIdShop(int idShop) {
        IdShop = idShop;
    }

    public int getIdAccount() {
        return IdAccount;
    }

    public void setIdAccount(int idAccount) {
        IdAccount = idAccount;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
