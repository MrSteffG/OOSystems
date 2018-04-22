package depotSystem;

public class WorkSchedule {
	private String depot;
	private String client;
	private String startDate;
	private String endDate;
	private String regNo;
	private String driver;
	private String state;

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
	public String getregNo(){
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
}