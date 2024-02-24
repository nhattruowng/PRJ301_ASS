package src.java.database.connection.User;

public class User {
    private String Gmail;
    private String Name;
    private String Birth;
    private String Phone;
    private String Pass;

    public User(String gmail, String name, String birth, String phone, String pass) {
        Gmail = gmail;
        Name = name;
        Birth = birth;
        Phone = phone;
        Pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "Gmail='" + Gmail + '\'' +
                ", Name='" + Name + '\'' +
                ", Birth='" + Birth + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Pass='" + Pass + '\'' +
                '}';
    }
}
