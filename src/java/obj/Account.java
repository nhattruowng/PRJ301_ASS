package src.java.obj;

public class Account {
    private int IdAccount;
    private String Gmail;
    private byte[] Avatar;


    public Account(int idAccount, String gmail, byte[] avatar) {
        IdAccount = idAccount;
        Gmail = gmail;
        Avatar = avatar;
    }

    public int getIdAccount() {
        return IdAccount;
    }

    public void setIdAccount(int idAccount) {
        IdAccount = idAccount;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public byte[] getAvatar() {
        return Avatar;
    }

    public void setAvatar(byte[] avatar) {
        Avatar = avatar;
    }
}
