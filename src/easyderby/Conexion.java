package easyderby;
 /** 
 * 
 * @author Omar Lara
 */ 

import java.sql.*;

public class Conexion { 
   static String bd = "gallos"; 
   static String login = "root"; 
   static String password = ""; 
   static String url = "jdbc:mysql://localhost/"+bd; 
 
   public Connection conn = null; 
   static Statement stt; 
   public Conexion() { 
      try{          
         Class.forName("com.mysql.jdbc.Driver");          
         conn = DriverManager.getConnection(url,login,password); 
         if (conn!=null){ 
            stt = conn.createStatement(); 
            System.out.println("Conección a base de datos "+bd+". listo"); 
         } 
      }catch(SQLException e){ 
         System.out.println(e); 
      }catch(ClassNotFoundException e){ 
         System.out.println(e); 
      } 
   } 
    
   public Connection getConnection(){ 
      return conn; 
   } 
 
   public void desconectar(){ 
      conn = null; 
   } 
}