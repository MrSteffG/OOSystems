package depotSystem;

public class WorkSchedule {
	private String ID;
	private String client;
	private String startDate;
	private String endDate;
	private String regNo;
	private String driver;

	public WorkSchedule(String ID, String client, String startDate, String endDate, String regNo, String driver){
		this.ID= ID;
		this.client= client;
		this.startDate= startDate;
		this.endDate= endDate;
		this.regNo= regNo;
		this.driver= driver;
	}
}
