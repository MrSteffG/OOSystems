package depotSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class Depot {
	private String depotName;
	private Driver[] arrayDriver;
	private Vehicle[] arrayVehicle;
	
	
public Depot(String depotName, Driver[] driver, Vehicle[] vehicle){
		depotName="liverpool";
		this.depotName=depotName;
		arrayDriver= new Driver[2];
		
		arrayDriver[0]= new Driver("Steve", "donkeys");
		arrayDriver[1]= new Driver ("Pete", "cows1");
		arrayDriver[2]= new Driver("Dan","mongoose2");
		
		arrayVehicle= new Vehicle[3];
		arrayVehicle[0]=new Vehicle ("CS1457", "DAYCAB", "WHALEBODY");
		arrayVehicle[1]=new Vehicle("CS1458", "VOLVO", "FM7290");
		arrayVehicle[2]=new Vehicle("CS1451", "Mercedes-Benz", "Actros");
		arrayVehicle[3]=new Vehicle("CS1452", "Iveco", "PowerStar420E5");
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
public String getDepotName(){ 
		return depotName;
		
	}
}

