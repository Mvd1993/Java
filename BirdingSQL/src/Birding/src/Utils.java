package Birding.src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Utils {
	
	//static menu methods
	
	public static String ask(Scanner reader, String option) { 
		//Prompt
		System.out.println(option);
		
		//get the user answer
		option = reader.nextLine();
		
		return option;
	}
	
	
	 
	public static String askForName(Scanner reader) {
		System.out.println("Name: ");
		return reader.nextLine();
	}
	
	public static String askForNameLatin(Scanner reader){
		System.out.println("Latin name: ");
		return reader.nextLine();
	}
	
	public static void add(Scanner reader, Connection conn)throws Exception { 
		  //Ask for input data
	  
	  String name = Utils.askForName(reader); 
	  String nameLatin = Utils.askForNameLatin(reader);
	  
	  //Create object Bird 
	  Bird bird = new Bird(name, nameLatin, 0 );
	  
	  
	  
	  //Ask if bird is in BirdsDB 
	  if (isBirdInDb(bird, conn)) {
		  UtilsSQL.add(conn, bird.getName(), bird.getNameLatin(), bird.getObservations());
		    
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


		
	}
	
	
	
	public static void observation(Scanner reader, BirdsDB db) {
		//adds observation to bird
		//get the bird
		String name = askForName(reader);
		
		//ask if bird is on the wire (Leonard Cohen)
		int location = isBirdInDb( name, db );
		//System.out.println("location: "+location); // Just for checking purposes
		if (location  != -1) {
			//true add observation
			db.getBird(location).addObservation();
		}
		else {
		//false prompt a message
		noBirdMessage();
		}
	}
	
	public static void noBirdMessage() {
		System.out.println("This bird doesn't exists. Create it first, please.");
	}
		
	public static void show(Scanner reader, BirdsDB db) { 
		//shows single bird data
		
		//get the bird
		////ask the user
		String name = askForName( reader );
		////check if bird exists
		int location = isBirdInDb(name, db);
		
		//Print the data
		if (location != -1) {
		//////true print the bird data
			System.out.println(db.getBird(location)); //Prints bird data by default as defined in toString
		}
		else {
			//////false prompt a message 
			noBirdMessage();
		}
	}
	
	public static void statistics(BirdsDB db) { 
		//Print the complete DB
		System.out.println(db.toString());
		
	}

}

