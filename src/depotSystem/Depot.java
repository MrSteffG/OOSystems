package depotSystem;

import java.util.LinkedList;

public class Depot {
	private String depotName;
	private LinkedList<Driver> arrayDriver;
	private LinkedList<Vehicle> arrayVehicle;
	private Driver selected;
	private WorkSchedule WS;

	public Depot(String depotName, LinkedList<Driver> arrayDriver, LinkedList<Vehicle> arrayVehicle) {
		this.depotName = depotName;
		this.arrayDriver = arrayDriver;
		this.setArrayVehicle(arrayVehicle);

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

	public WorkSchedule setupWorkSchedule(String depot, String client, String startDate, String endDate, String regNo,
			String driver, String state) {
				return WS;

	
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
}