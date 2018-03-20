package depotSystem;

public class Job {
	private int jobNumber;
	private String clientName;
	private String jobStart;
	private String jobEnd;
	private int jobTime;
	private String jobState;
	private String jobType;
	
	public Job(int jobNumber,String clientName,String jobStart,String jobEnd, int jobTime, String jobState, String jobType){
		this.jobNumber= jobNumber;
		this.clientName= clientName;
		this.jobStart= jobStart;
		this.jobEnd= jobEnd;
		this.jobTime= jobTime;
		this.jobState= jobState;
		this.jobType= jobType;	
	};
	
	

}
