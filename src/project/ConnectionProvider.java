/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;


/**
 *
 * @author anasm
 */
public class ConnectionProvider {
	 private ConnectionProvider() {
   	 throw new IllegalStateException("Utility class");
 	 }
	 static Connection con= null;
	public static Connection getCon() throws SQLException {
		try{
			Class.forName ("com.mysql.cj.jdbc.Driver");
               String userName = "root";
               String password = "johnanas";
               String url = "jdbc:mysql://localhost:3306/gms";        
               con = DriverManager.getConnection (url, userName, password);	
			return con;
		}

		catch(ClassNotFoundException ex){
			return null;
		}
	}
}