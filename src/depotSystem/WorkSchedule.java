package depotSystem;

public class WorkSchedule {
	private String ID;
	private String depot;
	private String client;
	private String startDate;
	private String endDate;
	private String regNo;
	private String driver;
	private String state;

	public WorkSchedule(String ID, String depot, String client, String startDate, String endDate, String regNo, String driver, String state){
		this.ID= ID;
		this.depot= depot;
		this.client= client;
		this.startDate= startDate;
		this.endDate= endDate;
		this.regNo= regNo;
		this.driver= driver;
		this.state= state;
	}
	

	public String fullCheck(){
		String toprint=(depot+client+startDate);
		return toprint;
	}
		
	public String getWorkSchedule() {
		return ID;
	}
}