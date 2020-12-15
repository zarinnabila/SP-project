
package restaurant_management;

import java.sql.*;
import java.util.Scanner;
public class search {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;
    Scanner sc = null;

    void searchOperation() {
        try {
            int p=1;
            connect = rm.getInstance();
            sc = new Scanner(System.in);


            preparedStatement = connect.prepareStatement("SELECT * FROM FOOD WHERE FOOD_NAME=?");

            while (p==1) {
                System.out.println("Insert an FOOD name\n");
                preparedStatement.setString(1, sc.nextLine());
                result = preparedStatement.executeQuery();

                while (result.next()) {
                    System.out.println("Food name: " + result.getString("FOOD_NAME"));
                    System.out.println("ID: " + result.getInt("ID"));
                    System.out.println("TYPE: " + result.getString("FOOD_TYPE"));
                    System.out.println("PORTION: " + result.getString("FOOD_PORTION"));
                    System.out.println("Price: " + result.getString("FOOD_PRICE"));
                    

                }
                System.out.println("\n\npress: 0 to exit");
                Scanner wel= new Scanner(System.in);
                int u= wel.nextInt();
                if(u==0)
                { p++;}

            }

        }

        catch (Exception ex) {
            System.out.println("MyError: " + ex);
        }
        finally {
            rm.close();
        }
    }

    
}
