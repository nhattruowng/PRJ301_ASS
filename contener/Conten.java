package contener;

public enum Conten {
    DRIVERDB("com.microsoft.sqlserver.jdbc.SQLServerDriver"),
    DB_NAME("NHATTRUONG"),
    DB_USER("sa"),
    DB_PASS("1234"),
    URL("jdbc:sqlserver://localhost:1433;databaseName="),

    DB_QUERY_CheckLogin(" select*from UserManagement where Gmail=? and Password=?");

    private final String s;
    Conten(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
