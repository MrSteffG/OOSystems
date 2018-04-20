package depotSystem;

import java.util.LinkedList;

public class Depot {
	private String depotName;
	private LinkedList<Driver> arrayDriver;
	private LinkedList<Vehicle> arrayVehicle;
	private Driver selected;
	

	
	public Depot(String depotName, LinkedList<Driver> arrayDriver, LinkedList<Vehicle> arrayVehicle) {
		this.depotName=depotName;
		this.arrayDriver=arrayDriver;
		this.arrayVehicle=arrayVehicle;

	}

	public Driver logOn(String userName, String password){
	selected=getDriver(userName);
		
		if (selected.checkPassword(password)){
			System.out.println("worked");	
			return selected;
			}
		else
			System.out.print("Not recognised please try again");
		return null;
	}


	public Vehicle getVehicle(String regNo) {
		for (Vehicle currentVehicle : arrayVehicle) {
			if (currentVehicle.getRegNo() == regNo) {
				return currentVehicle;
			}
		}
		return null;
	}

	public Driver getDriver(String userName) {//this bit works
		for (Driver currentDriver : arrayDriver) {
			if (currentDriver.getUser().equals(userName)) {
				return currentDriver;
			}
		}
		return null;
	}
	
	public WorkSchedule setupWorkSchedule(String depot, String client, String startDate, String endDate, String regNo, String driver, String state) {
	
		WorkSchedule WS001 = new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "Completed");
		WorkSchedule WS002 = new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "Active");
		WorkSchedule WS003 = new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "Pending");
		return null;
	}
	
	public static WorkSchedule WorkScheduleTest1() {
		
		String Depot = "liverpool";
		String client = "Markyboi";
		String startDate = "1st May 2018";
		String endDate = "3rd May 2018";
		String regNo = "CS1457";
		String driver = "Steve";
		String state = "";
		
		WorkSchedule WS1 = new WorkSchedule(Depot, client, startDate, endDate, regNo, driver, state);
		return WS1;
	}
	
	public String getDepotName() {
		return depotName;
	}
}