package restaurant_management;

import java.sql.SQLException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws SQLException {
        int run = 0;
        while (run == 0) {
            System.out.print("\n ***Welcome to Our Project***\n");
            System.out.print("\nPRESS: 1 - To search food\n");
            System.out.print("PRESS: 2 - To add food\n");
            System.out.println("PRESS: 3 - To delete food");
            System.out.println("PRESS: 4 - To view user list");
            
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            
            if (a == 1) {
                search db = new search();
                db.searchOperation();
            }
            if (a == 2) {
                ADD_FOOD db = new ADD_FOOD();
                db.AddfoodOperation();
            }
            if (a == 3) {
                DELETE_FOOD db = new DELETE_FOOD();
                db.dltOperation();
            }
            if (a == 4) {
                USER db = new USER();
                db.userOperation();
            }
          
        }
    }
    
}
