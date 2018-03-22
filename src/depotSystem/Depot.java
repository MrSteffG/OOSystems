package depotSystem;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;



public class Depot {
	private String depotName;
	private Driver[] driver;
	private Vehicle[] vehicle;
	
	
	public Depot(String depotName, Driver[] driver, Vehicle[] vehicle){
		this.depotName= depotName;
		this.driver= driver;
		this.vehicle= vehicle;

	}
	
public static void logon(String userName, String pass) throws FileNotFoundException{
	boolean check=Driver.checkPassword(userName,pass);
	if (check=true){System.out.print("sound");}
	else{System.out.println("ratbag");}
	}
		

	 
	 public void GetVehicle(String regNo, String model, String make, int weight, String jobState) throws FileNotFoundException {
		 Scanner sc = new Scanner(new FileReader(""));
		 
		 sc.close();
	 }
	 
	 public void GetDriver() {
	 }
		
	 public void SetupWorkSchedule() {
		 
	 }
	
}

