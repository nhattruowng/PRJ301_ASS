package src.java.obj;

public class Follow {
    private int IdFollow;
    private int IdAccount;
    private int IdShop;

    public Follow(int idFollow, int idAccount, int idShop) {
        IdFollow = idFollow;
        IdAccount = idAccount;
        IdShop = idShop;
    }

    public int getIdFollow() {
        return IdFollow;
    }

    public void setIdFollow(int idFollow) {
        IdFollow = idFollow;
    }

    public int getIdAccount() {
        return IdAccount;
    }

    public void setIdAccount(int idAccount) {
        IdAccount = idAccount;
    }

    public int getIdShop() {
        return IdShop;
    }

    public void setIdShop(int idShop) {
        IdShop = idShop;
    }
}
