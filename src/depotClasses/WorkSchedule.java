package depotClasses;

public class WorkSchedule {
	private String depot;
	private String client;
	private String startDate;
	private String endDate;
	private String regNo;
	private String driver;
	private String state;

	/**
	 * Constructs a work schedule consisting of depot, client, start date, end date, registration number, driver and state.
	 * @param depot identifies the depot the WS is based from
	 * @param client identifies the client 
	 * @param startDate the start date of the schedule
	 * @param endDate the end date of the schedule
	 * @param regNo used to identify the vehicle used
	 * @param driver used to identify the driver
	 * @param state used to identify the state, either active, pending or archived
	 */
	public WorkSchedule(String depot, String client,String startDate , String endDate, String regNo, String driver, String state){
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
		
	public String getDepot(){
		return depot;
	}
	
	public String getClient(){
		return client;
	}
	
	public String getStartDate(){
		return startDate;
	}
	
	public String getEndDate(){
		return endDate;
	}
	
	public String getRegNo() {
		return regNo;
	}
	
	public String getDriver(){
		return driver;
	}
	
	public String getState(){
		return state;
	}
	
	public String toString(){
		return client+" "+startDate+" "+endDate+" "+regNo;
	}
	
	public void setState(String newState){
		this.state=newState;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
}

