package depotSystem;

public class WorkSchedule {
	private String Depot;
	private String client;
	private String startDate;
	private String endDate;
	private String regNo;
	private String driver;
	private String state;

	public WorkSchedule(String Depot, String client, String startDate, String endDate, String regNo, String driver, String state){
		this.Depot= Depot;
		this.client= client;
		this.startDate= startDate;
		this.endDate= endDate;
		this.regNo= regNo;
		this.driver= driver;
		this.state= state;
	}
	
	public String fullCheck(){
		String toprint=(Depot+client+startDate);
		return toprint;
		
		

		
	}
}

