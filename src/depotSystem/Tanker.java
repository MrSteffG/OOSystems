package depotSystem;

import java.util.LinkedList;

public class Tanker extends Vehicle {
	private String cargoCapactity;

	public Tanker(String regNo, String model, String make, LinkedList<WorkSchedule> wsList, int weight, String jobState,
			String cargoCapacity) {
		super(regNo, model, make, wsList);
		this.cargoCapactity = cargoCapacity;
	}

}
