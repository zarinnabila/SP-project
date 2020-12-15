
package restaurant_management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class rm {
    
    private static Connection connection = null;

    static java.sql.Connection getInstance() throws ClassNotFoundException, SQLException {
        if (connection==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/restaurant_management?" + "user=root");
        }
        return connection;
    }

    public static void close() {
    }
}
