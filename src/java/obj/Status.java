package src.java.obj;

public class Status {
    private int IdStatus;
    private int IdAccount;
    private boolean Status;
    private String dateOn;
    private String dateOff;

    public Status(int idStatus, int idAccount, boolean status, String dateOn, String dateOff) {
        IdStatus = idStatus;
        IdAccount = idAccount;
        Status = status;
        this.dateOn = dateOn;
        this.dateOff = dateOff;
    }

    public int getIdStatus() {
        return IdStatus;
    }

    public void setIdStatus(int idStatus) {
        IdStatus = idStatus;
    }

    public int getIdAccount() {
        return IdAccount;
    }

    public void setIdAccount(int idAccount) {
        IdAccount = idAccount;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getDateOn() {
        return dateOn;
    }

    public void setDateOn(String dateOn) {
        this.dateOn = dateOn;
    }

    public String getDateOff() {
        return dateOff;
    }

    public void setDateOff(String dateOff) {
        this.dateOff = dateOff;
    }
}
