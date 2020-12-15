
package restaurant_management;
import java.sql.*;
import java.util.Scanner;
public class USER {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;


    void userOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }

            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/restaurant_management?" + "user=root");

            String query = "SELECT * FROM ADMIN";

            Statement st = conn.createStatement();

            
            ResultSet rs = st.executeQuery(query);

            
            while (rs.next())
            {
                String NAME = rs.getString("NAME");
                String ID = rs.getString("ID");
                String SECTION = rs.getString("SECTION");

                
                System.out.format("\n|\t%s\t|\t%s\t|\t%s\t|\n", NAME, ID,SECTION);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
