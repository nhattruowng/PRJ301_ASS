package src.java.obj;

public class Evaluate {
    private int IdProduct;
    private int IDAccount;
    private int Star;
    private byte[] ImageEva;
    private String Conment;


    public Evaluate(int idProduct, int IDAccount, int star, byte[] imageEva, String conment) {
        IdProduct = idProduct;
        this.IDAccount = IDAccount;
        Star = star;
        ImageEva = imageEva;
        Conment = conment;
    }


    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }

    public int getIDAccount() {
        return IDAccount;
    }

    public void setIDAccount(int IDAccount) {
        this.IDAccount = IDAccount;
    }

    public int getStar() {
        return Star;
    }

    public void setStar(int star) {
        Star = star;
    }

    public byte[] getImageEva() {
        return ImageEva;
    }

    public void setImageEva(byte[] imageEva) {
        ImageEva = imageEva;
    }

    public String getConment() {
        return Conment;
    }

    public void setConment(String conment) {
        Conment = conment;
    }
}
