
package restaurant_management;
import java.sql.*;
import java.util.Scanner;
public class DELETE_FOOD {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;


    void dltOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/restaurant_management?" + "user=root");

            System.out.println("\nEnter the id you want delete:");
            Scanner si= new Scanner(System.in);
            int fd = si.nextInt();

            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/restaurant_management?" + "user=root");

            String query = "DELETE FROM FOOD where ID = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt   (1, fd);


            // execute the java preparedstatement
            preparedStmt.executeUpdate();

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
