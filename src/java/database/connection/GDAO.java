package src.java.database.connection;

import src.java.database.connection.User.User;
import src.java.database.connection.repository.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GDAO implements DAL {


    @Override
    public ResultSet getData(String quary, String... keys) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = ConnectionManager.getConnection();
            stm = con.prepareStatement(quary);
            int count = 1;
            for (String k : keys) {
                stm.setString(count++, k);
            }
            rs = stm.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    public List<User> userList(ResultSet rs) throws SQLException {
        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            String Gmail = rs.getString("Gmail");
            String name = rs.getNString("Name");
            String birth = rs.getString("BirthDate");
            String phone = rs.getString("numberPhone");
            String pass = rs.getString("Password");
            userList.add(new User(Gmail, name, birth, phone, pass));
        }
        return userList;
    }


}
