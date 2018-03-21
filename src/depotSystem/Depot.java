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
	
public void logon(String userName, String pass) throws FileNotFoundException{
	Scanner sc = new Scanner(new FileReader("M:\\data\\drivers"));
	String next;
	while (sc.hasNextLine()){
		next = sc.nextLine();
		list.add(next);
		if(next.equals(userName)){break;}
		
		boolean passOkay=(Driver.checkPassword(pass));}
	sc.close();
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

