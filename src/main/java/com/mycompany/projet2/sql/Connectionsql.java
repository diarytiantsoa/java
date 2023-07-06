package com.mycompany.projet2.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author dell
 */
 public class Connectionsql {
     private static String url="jdbc:postgresql://localhost:5432/projet";
     private static String  username="postgres";
     private static String password="admin";
     private static Connection conn;
     
     public static Connection connexion(){
         try{
             Class.forName("org.postgresql.Driver");
             conn=DriverManager.getConnection(url,username,password);
             
         }
         catch(ClassNotFoundException | SQLException e){
             System.out.println("Erreur de connexion a la base de donnes" + e);
             JOptionPane.showMessageDialog( null, "Erreur de connexion a la base de donnes " + e," Erreur ",JOptionPane.ERROR_MESSAGE);
             
         }
         return conn;
     } 
    
}
