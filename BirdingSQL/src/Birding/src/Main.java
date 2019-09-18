package Birding.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// Watching up birds!
		
		//Create a Birds Data Base
		
		Class.forName("org.h2.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/mydb","sa", "SA");
	    Statement stat = conn.createStatement();
	    stat.execute("create table if not exists birdsdb (id int primary key AUTO_INCREMENT, name varchar(255), nameLatin varchar(255), observations int)");
		stat.close();
		
		//Ask user from menu by scanner
		Scanner reader = new Scanner(System.in);
		
		Menu menu = new Menu(reader);
		menu.loop(reader,conn);
		
		System.out.println("See you in the sky!");
	}	

}


