package mldn.dbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC";
    private static final String DBUSER = "root";
    private static final String PASSWORD = "password";
    private Connection conn = null;

    public DatabaseConnection() {
        try {
            Class.forName(DBDRIVER);
            this.conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void close() {
        if (this.conn != null)
            try {
                this.conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}