package atm.simulator.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection Conn;
    Statement statement;
   public Conn() {
       try {

           Conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Pranjul12@");
           statement=Conn.createStatement();
       } catch (Exception e) {
           e.printStackTrace();
       }

   }
}

