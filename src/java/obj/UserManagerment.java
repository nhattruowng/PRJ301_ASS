package src.java.obj;

public class UserManagerment {
    private String Gmail;
    private String Name;
    private String BirthDate;
    private String numberPhone;
    private String Password;

    public UserManagerment(String gmail, String name, String birthDate, String numberPhone, String password) {
        Gmail = gmail;
        Name = name;
        BirthDate = birthDate;
        this.numberPhone = numberPhone;
        Password = password;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
