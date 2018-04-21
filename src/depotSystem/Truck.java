package depotSystem;

import java.util.LinkedList;

public class Truck extends Vehicle {
	private String type;

	public Truck(String regNo, String model, String make, LinkedList<WorkSchedule> wsList, int weight, String jobState,
			String type) {
		super(regNo, model, make, wsList);
	}

}
