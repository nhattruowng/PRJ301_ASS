package src.java.obj;

public class Notification {
    private int IdNotification;
    private int IdFollow;
    private boolean Status;

    private String Content;


    public Notification(int idNotification, int idFollow, boolean status, String content) {
        IdNotification = idNotification;
        IdFollow = idFollow;
        Status = status;
        Content = content;
    }

    public int getIdNotification() {
        return IdNotification;
    }

    public void setIdNotification(int idNotification) {
        IdNotification = idNotification;
    }

    public int getIdFollow() {
        return IdFollow;
    }

    public void setIdFollow(int idFollow) {
        IdFollow = idFollow;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
