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
	boolean check=Driver.checkPassword(userName,pass);
	if (check=true){System.out.print("sound");}
	else{System.out.println("ratbag");}
	}
		

	 
	 public void GetVehicle() {
		 
	 }
	 
	 public void GetDriver() {
		 
	 }
		
	 public void SetupWorkSchedule() {
		 
	 }
	
}

