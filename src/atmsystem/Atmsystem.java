package atmsystem;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Atmsystem {

    public static Connection connect()
    {
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/atmsystem?","root","");
        }catch (Exception e)
        {
            System.out.println("insert.Dbconnet.Connetion");
            JOptionPane.showConfirmDialog(null,e);
        }
        return null;
  
        
    }
    
    
    
}