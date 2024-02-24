package src.java.database.connection.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DAL {


    /**
     * get database return ResultSet with all data
     * @param quary  is a dynamic STRing variable all entered in order of 1 query database,.... variable to search.
     *
     *The function will browse in 1st order, the next hexagram
     *              will be the input variables that need to be stored in the database.
     * @return ResultSet with all data
     */
    ResultSet getData(String quary,String ... keys) throws SQLException, ClassNotFoundException;
}
