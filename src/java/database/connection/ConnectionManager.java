
package src.java.database.connection;

import contener.Conten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ltn04
 * @see
 * Contains database link functions
 */

public class ConnectionManager {
    
    
    /**
     * tao conect database 
     * su dung dinamic database
     * @return Conection 
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(Conten.DRIVERDB.toString());
        return DriverManager.getConnection(Conten.URL.toString()+Conten.DB_NAME,Conten.DB_USER.toString(),Conten.DB_PASS.toString());
    }



}
