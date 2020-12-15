
package restaurant_management;

import java.sql.*;
import java.util.Scanner;

public class ADD_FOOD {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;


    void AddfoodOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("\nEnter FOOD_TYPE:");
            Scanner sg= new Scanner(System.in);
            String ft = sg.nextLine();
            System.out.println("\nEnter FOOD_NAME:");
            Scanner si= new Scanner(System.in);
            String fn = si.nextLine();
            System.out.println("\nEnter FOOD_PORTION:");
            Scanner sn= new Scanner(System.in);
            String fp = sn.nextLine();
            System.out.println("\nEnter FOOD_PRICE:");
            Scanner sa= new Scanner(System.in);
            String fpp = sa.nextLine();
         

            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/restaurant_management?" + "user=root");

            String query = "INSERT INTO FOOD(FOOD_TYPE,FOOD_NAME,FOOD_PORTION,FOOD_PRICE)"+"VALUES(?,?,?,?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, ft);
            preparedStmt.setString (2, fn);
            preparedStmt.setString (3, fp);
            preparedStmt.setString (4, fpp);

            // execute the preparedstatement
            preparedStmt.execute();


            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
