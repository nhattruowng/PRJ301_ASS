package src.java.database.connection.User;

import src.java.database.connection.GDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import contener.Conten;
public class tester {

    public static void main(String[] args) {
        GDAO gd=new GDAO();
        String gmail="admin@gmail.com";
        String Password="1234";
        try {

            ResultSet rs = gd.getData(Conten.DB_QUERY_CheckLogin.toString(),gmail,Password);
            List<User> userList = gd.userList(rs);
            if(!userList.isEmpty()){
                for(User user : userList){
                    System.out.println(user.toString());
                }
            }else {
                System.out.println("isempty");
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
