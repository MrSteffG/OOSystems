package depotSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;



public class Depot {
	private String name;
	
	@SuppressWarnings("rawtypes")
	LinkedList list= new LinkedList();
	
	
	
	public Depot(String name){
		this.name= name;
	}
	
public void logon(String userName, String pass) throws FileNotFoundException{
	Scanner sc = new Scanner(new FileReader("M:\\data\\drivers"));
	String next;
	while (sc.hasNextLine()){
		next = sc.nextLine();
		list.add(next);
		if(next.equals(userName)){break;}
		
		boolean passOkay=(Driver.checkPassword(pass));
		
	
		
}
	}
}
		
			
		


