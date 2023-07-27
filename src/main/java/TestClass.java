import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestClass {
    public static final String url = "jdbc:mysql://localhost:3306/training_db";
    public static final String user = "root";
    public static final String pass = "boss1949";
    public static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException t) {
            t.printStackTrace();
            throw new RuntimeException();
        }
        return connection;
    }

}
