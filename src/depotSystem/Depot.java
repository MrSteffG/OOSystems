package depotSystem;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;



public class Depot {
	private int ID;
	private String name;
	
	@SuppressWarnings("rawtypes")
	LinkedList list= new LinkedList();
	
	
	
	public Depot(int ID, String name){
		this.ID= ID;
		this.name= name;
	}
	
public static void logon(String userName, String pass) throws FileNotFoundException{
	boolean check=Driver.checkPassword(userName,pass);
	if (check=true){System.out.print("sound");}
	else{System.out.println("ratbag");}
	}
		

	 
	 public void GetVehicle(String regNo, String model, String make, int weight, String jobState) throws FileNotFoundException {
		 Scanner sc = new Scanner(new FileReader("M:\\data\\vehicles"));
		 
		 sc.close();
	 }
	 
	 public void GetDriver() {
	 }
		
	 public void SetupWorkSchedule() {
		 
	 }
	
}

