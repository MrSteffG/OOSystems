package depotSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class Depot {
	private static String depotName;
	private Driver[] arrayDriver;
	private Vehicle[] arrayVehicle;
	
	
public Depot(String depotName, Driver[] arrayDriver, Vehicle[] arrayVehicle){
	this.depotName=depotName;
	this.arrayDriver=arrayDriver;
	this.arrayVehicle=arrayVehicle;
	
	}
	
public boolean logon() {
	Scanner sc=new Scanner(System.in);
	
     System.out.println("Please enter your Username : ");
     String user = sc.next();

     System.out.println("Please enter your PIN : ");
     String password =sc.next();
     
     Driver.checkPassword(user,password);

     
     

  return false;   
}
		

	 
public Vehicle GetVehicle(String regNo) {
        for (Vehicle currentVehicle : arrayVehicle) {
            if (currentVehicle.getRegNo() == regNo) {
                return currentVehicle;
            }
 }
        return null;
}
		
	 
	 
public Driver GetDriver(String userName) {
	        for (Driver currentDriver : arrayDriver) {
	            if (currentDriver.getUser() == userName) {
	                return currentDriver;
	            }
	 }
	        return null;
}
		
public void SetupWorkSchedule() {
		 
	 }
public static String getDepotName(){ 
		return depotName;
	}
}

