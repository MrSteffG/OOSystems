package depotClasses;

import java.util.LinkedList;

public class Depot {
	private String depotName;
	private LinkedList<Driver> listDriver;
	private LinkedList<Vehicle> listVehicle;
	private Driver selected;
	private LinkedList<WorkSchedule> wS;

	/**
	 * Constructs a depot consisting of a name, drivers, vehicles and work
	 * schedule.
	 * 
	 * @param depotName
	 *            the name of the depot usually after it's location
	 * @param arrayDriver
	 *            the drivers based in this depot
	 * @param arrayVehicle
	 *            the vehicles based in this depot
	 * @param wS
	 *            the work schedule this depot adheres to
	 */
	public Depot(String depotName, LinkedList<Driver> listDriver, LinkedList<Vehicle> listVehicle,
			LinkedList<WorkSchedule> wS) {
		this.depotName = depotName;
		this.listDriver = listDriver;
		this.listVehicle = listVehicle;
		this.wS = wS;
	}

	public Driver logOn(String userName, String password) {

		selected = getDriver(userName);
		if (selected != null) {

			if (selected.checkPassword(password)) {
				System.out.println("Login Success");
				return selected;
			} else
				System.out.print("Not recognised please try again");
			return null;
		}
		return null;
	}

	public Vehicle getVehicle(String regNo) {
		for (Vehicle currentVehicle : listVehicle) {
			if (currentVehicle.getRegNo().equals(regNo)) {
				return currentVehicle;
			}
		}
		return null;
	}

	public Driver getDriver(String userName) {
		for (Driver currentDriver : listDriver) {
			if (currentDriver.getUserName().equals(userName)) {
				return currentDriver;
			}
		}
		return null;
	}

	public WorkSchedule setWorkSchedule(String depot, String client, String startDate, String endDate, String regNo,
			String driver, String state) {
		WorkSchedule WS = new WorkSchedule(depot, client, startDate, endDate, regNo, driver, state);
		wS.add(WS);
		return WS;

	}

	public String getDepotName() {
		return depotName;
	}

	public LinkedList<Driver> getListDriver() {
		return listDriver;
	}

	public LinkedList<Vehicle> getListVehicle() {
		return listVehicle;
	}

	public LinkedList<WorkSchedule> getWS() {

		return wS;
	}
	

	public void setListVehicle(Vehicle vehicle) {
		listVehicle.add(vehicle);
	}

	public void setListDriver(LinkedList<Driver> listDriver) {

	}
}