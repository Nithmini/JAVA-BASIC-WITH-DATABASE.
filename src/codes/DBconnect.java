package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect {
    
    public static Connection connect(){
       Connection con = null; 
       
       try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","mysql");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       return con;
    }
    
}
