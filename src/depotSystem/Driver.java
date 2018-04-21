package depotSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

public class Driver {
	protected String userName;
	protected String password;
	protected LinkedList<WorkSchedule> wsList;

	public Driver(String userName, String password, LinkedList<WorkSchedule> wsList) {
		this.userName = userName;
		this.password = password;
		this.wsList = wsList;

	};

	public boolean checkPassword(String pass) {
		if (pass.equals(password)) {
			return true;
		} else
			return false;
	}

	public String getUser() {
		return userName;
	}
	

	public boolean isAvailble(LocalDate newSD, LocalDate newED) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
		for(WorkSchedule currentWS:wsList){
			String start= currentWS.getStartDate();
			String end=currentWS.getEndDate();
			LocalDate startDate = LocalDate.parse(start, formatter);
			LocalDate endDate=LocalDate.parse(end, formatter);
			if(newSD.isAfter(startDate)){
				if(newSD.isBefore(endDate)){
					return false;
				}	
			}
			if(newSD.isBefore(startDate)){
				if(newED.isAfter(endDate))
					return false;
				}
				if(newED.isAfter(startDate)){
					return false;	
				}
				else return true;
			}
			
			
			return false;
	}
			
		
}


