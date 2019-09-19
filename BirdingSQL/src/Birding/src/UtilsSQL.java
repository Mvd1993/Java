package Birding.src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UtilsSQL {
	
	public static void add(Connection conn, String name, String latinName, int observations)throws Exception { 
		  //Ask for input data
	  
	 
	  Statement stat = conn.createStatement();
	  
	  
	  
	  stat.execute("insert into birdsdb values(null,'"+name+"','"+latinName+"',"+observations+")");  
	
	  stat.close();
	  
	  }
	
	
	
	public static void showAll(Connection conn) throws SQLException {
		Statement stat = conn.createStatement();
		ResultSet rs;
		rs = stat.executeQuery("Select * from birdsdb");
		while (rs.next()){
			System.out.println("name : "+rs.getString("name")+" | NameLatin : "+rs.getString("nameLatin")+" | Observations : "+rs.getInt("observations"));
			
		}
		
		
	}
	
	public static boolean isBirdInDb(Bird bird, Connection conn)throws Exception {	
		//Check for empty array
		Statement stat = conn.createStatement();
		ResultSet rs;
		String name = bird.getName();
        rs = stat.executeQuery("select name from birdsdb");
		//Ask if bird is in BirdsDB
		
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
        
       return true;

		//If not add bird to BirdsDB
		
	}
}
