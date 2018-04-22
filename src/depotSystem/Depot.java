package depotSystem;


import java.util.LinkedList;

public class Depot {
	private String depotName;
	private LinkedList<Driver> arrayDriver;
	private LinkedList<Vehicle> arrayVehicle;
	private Driver selected;
	private LinkedList<WorkSchedule> wS;
	

	public Depot(String depotName, LinkedList<Driver> arrayDriver, LinkedList<Vehicle> arrayVehicle, LinkedList<WorkSchedule> wS) {
		this.depotName = depotName;
		this.arrayDriver = arrayDriver;
		this.arrayVehicle=arrayVehicle;
		this.wS=wS;
		

	}

	public Driver logOn(String userName, String password) {
		selected = getDriver(userName);

		if (selected.checkPassword(password)) {
			System.out.println("worked");
			return selected;
		} else
			System.out.print("Not recognised please try again");
		return null;
	}

	public Vehicle getVehicle(String regNo) {
		for (Vehicle currentVehicle : getArrayVehicle()) {
			if (currentVehicle.getRegNo().equals(regNo)) {
				return currentVehicle;
			}
		}
		return null;
	}

	public Driver getDriver(String userName) {// this bit works
		for (Driver currentDriver : arrayDriver) {
			if (currentDriver.getUser().equals(userName)) {
				return currentDriver;
			}
		}
		return null;
	}

	public void setupWorkSchedule(String depot, String client, String startDate, String endDate, String regNo,
			String driver, String state) {
		WorkSchedule WS= new WorkSchedule(depot, client, startDate, endDate, regNo, driver, state);
		wS.add(WS);	
	}


	public String getDepotName() {
		return depotName;
	}

	public LinkedList<Vehicle> getArrayVehicle() {
		return arrayVehicle;
	}

	public void setArrayVehicle(LinkedList<Vehicle> arrayVehicle) {
		this.arrayVehicle = arrayVehicle;
	}

	public LinkedList<Driver> getArrayDriver() {
		return arrayDriver;
	}

	public LinkedList<WorkSchedule> getWS() {
		
		return wS;
	}
}