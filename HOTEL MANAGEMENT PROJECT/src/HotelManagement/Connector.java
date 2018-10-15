
package HotelManagement;

import java.sql.*;
import javax.sql.*;
import javax.swing.*;

public class Connector {
    
    public static Connection ConnectDb(){
       
    Statement stmt;
    PreparedStatement stat;
    ResultSet rs;
    
        Connection connection= null;
        try{
        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection("jdbc:sqlserver://SALIMON; databaseName=Hotel; user=sa; password=ayo");
       
            stmt= connection.createStatement();
            
            return connection; 
        
        }catch(Exception e){
            System.out.println(e);
      
            return connection;
        }
      
    }
    
    public static void main(String[] args) {
        ConnectDb();
    }
}

