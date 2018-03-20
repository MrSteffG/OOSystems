package depotSystem;

public abstract class Vehicle{
	private String regNo;
	private String model;
	private String make;
	private int weight;
	private String jobState;
	

	public Vehicle(String regNo, String model, String make, int weight, String jobState){
		this.regNo= regNo;
		this.model= model;
		this.make= make;
		this.weight= weight;
		this.jobState=jobState;
			
	};
	
	
}
