
package connection;
import java.sql.*;
import javax.swing.*;

public class connection {
    Connection con=null;
    
    public static Connection connect(){
    
        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmsdb","root","");
            // JOptionPane.showMessageDialog(null, "School management database connectted");
             return conn;
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
         return null;
         
        }
        
    }
}
