package depotSystem;

public class Tanker extends Vehicle {
	private String cargoCapactity;

	public Tanker(String regNo, String model, String make, int weight, String jobState, String cargoCapacity) {
		super(regNo, model, make, weight, jobState);
		this.cargoCapactity = cargoCapacity;
	}

}
