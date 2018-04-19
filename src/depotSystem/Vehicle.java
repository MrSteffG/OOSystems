package depotSystem;

public class Vehicle{
	private String regNo;
	private String model;
	private String make;
	private int weight;
	private String jobState;
	

	public Vehicle(String regNo, String model, String make){
		this.regNo= regNo;
		this.model= model;
		this.make= make;
	
			
	};
	public String getRegNo(){
		return regNo;
	
	}
	
	public boolean isAvailble() {
		//if (Vehicle.regNo) {
		//	return true;
		//} else 
			return false;
	}
	
	
}
