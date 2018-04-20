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
	
public static WorkSchedule WorkScheduleTest1() {
		
		String ID = "001";
		String Depot = "liverpool";
		String client = "Markyboi";
		String startDate = "1st May 2018";
		String endDate = "3rd May 2018";
		String regNo = "CS1457";
		String driver = "Steve";
		String state = "";
		
		WorkSchedule WS1 = new WorkSchedule(ID, Depot, client, startDate, endDate, regNo, driver, state);
		return WS1;
	}
	
	public static WorkSchedule WorkScheduleTest2() {
		
		String ID = "002";
		String Depot = "manchester";
		String client = "Jeremy";
		String startDate = "1st May 2018";
		String endDate = "3rd May 2018";
		String regNo = "CS1459";
		String driver = "Steve";
		String state = "";
		
		WorkSchedule WS2 = new WorkSchedule(ID, Depot, client, startDate, endDate, regNo, driver, state);
		return WS2;
	}
	
	public static WorkSchedule WorkScheduleTest() {
		
		String ID = "003";
		String Depot = "birmingham";
		String client = "Milo";
		String startDate = "1st May 2018";
		String endDate = "3rd May 2018";
		String regNo = "CS1461";
		String driver = "Milo";
		String state = "";
		
		WorkSchedule WS3 = new WorkSchedule(ID, Depot, client, startDate, endDate, regNo, driver, state);
		return WS3;
	}
}

