package depotClasses;

import java.util.LinkedList;

public class Tanker extends Vehicle {
	private int liquidCapacity;
	private String liquidType;

	/**
	 * Constructs a tanker vehicle type consisting of registration number,
	 * model, make, work schedule, weight, job state and cargo capacity.
	 * 
	 * @param regNo
	 *            the registration number used to identify the vehicle.
	 * @param model
	 *            the model of the vehicle.
	 * @param make
	 *            the make of the vehicle.
	 * @param wsList
	 *            the work schedule this vehicle adheres to.
	 * @param weight
	 *            the weight of the vehicle.
	 * @param jobState
	 *            the job state of this vehicle.
	 * @param cargoCapacity
	 *            the cargo capacity of the vehicle.
	 */
	public Tanker(String regNo, String model, String make, LinkedList<WorkSchedule> wsList, int weight,
			int liquidCapacity, String liquidType) {
		super(regNo, model, make, wsList);
		this.liquidCapacity = liquidCapacity;
		this.liquidType= liquidType;
	}

	public int getLiquidCapactity() {
		return liquidCapacity;
	}
	
	public String getLiquidType(){
		return liquidType;
		
	}
	
	public void setLiquidType(String type){
		liquidType=type;
	}
	
	public void setliquidCapactity(int capacity){
		liquidCapacity= capacity;
	}
}
