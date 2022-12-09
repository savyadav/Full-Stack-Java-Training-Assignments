package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

//low level module implemented Dependency Inversion principle and LiskovPrinciple
public class MySQLDatabase implements Database {

	@Override
	public Connection connect() {
		System.out.println("Connecting to a MySQL database...");
		 final String url = "jdbc:mysql://localhost:3306/demo";
		    
		    Connection conn = null;
		    String user;
	        String password ;
	        Scanner sc=new Scanner(System.in);
	        System.out.println(" Enter your username : ");
	        user=sc.next();
	        System.out.println(" Enter your password : ");
	        password=sc.next();
	      
	        try {
	            conn = DriverManager.getConnection(url, user, password);
	          
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	        return conn;
	    }
	
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting the MySQL database...");
	}
}