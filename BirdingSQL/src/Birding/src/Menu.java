package Birding.src;



import java.util.Scanner;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {		
	private Scanner reader;

	
	
	public Menu(Scanner reader) {
		this.reader = reader;
		
	}
		
	public  void loop(Scanner reader, Connection conn)throws Exception {	
		MenuOptions options = new MenuOptions();
	
		
	    while (true) {
	    	options.printOptions();
	        String command = Utils.ask(this.reader, "Option?");
	        
	        try {
	        	options.getOption(command);	        	
	        } catch (Exception e) {
	        	System.out.println("Unknown command!");
	        }
	
	        if (command.equals("Quit")) {
	            break;
			} 
				  else if (command.equals("Add")) { 
					  Utils.add(this.reader,conn); } 
				  
				  else if (command.equals("Statistics")) { 
					  UtilsSQL.showAll(conn); }
	        
	        
				  /*else if (command.equals("Observation")) { 
					  Utils.observation(this.reader,db); } 
				  
				   else if (command.equals("Show")) { 
					  Utils.show(this.reader,conn); } 
				  */
				 
	    }
	}
}
