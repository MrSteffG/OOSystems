package depotClasses;

import java.util.LinkedList;

public class Truck extends Vehicle {
	private String type;

	/**
	 * Constructs a truck vehicle type consisting of registration number, model, make, work schedule, weight, job state and cargo type.
	 * @param regNo the registration number used to identify the vehicle.
	 * @param model the model of the vehicle.
	 * @param make the make of the vehicle.
	 * @param wsList the work schedule this vehicle adheres to.
	 * @param weight the weight of the vehicle.
	 * @param jobState the job state of this vehicle.
	 * @param type the type of cargo this vehicle holds
	 */
	public Truck(String regNo, String model, String make, LinkedList<WorkSchedule> wsList, int weight, String jobState,
			String type) {
		super(regNo, model, make, wsList);
	}
	
	public String getType() {
		return type;
	}

}
