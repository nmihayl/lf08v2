import java.sql.*;

public class testDB {
    static Connection connection = null;
    static String url = "jdbc:mysql://localhost:3306/test";
    static String user = "root";
    static String pwd = "nick";

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(url, user, pwd);
            System.out.println("Erfolgreiche Verbindung.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

