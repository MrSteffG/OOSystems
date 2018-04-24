package depotClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

import depotSys.Sys;

public class Archive implements Runnable {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
	public void run() {
		while(true){
		archiver();
		}
	}
		
	public synchronized void archiver(){
		for(Depot currentDepot: Sys.getDepotList()){	
		for (WorkSchedule currentWS : currentDepot.getWS()){
			String start = currentWS.getStartDate();
			String end = currentWS.getEndDate();
			LocalDate startD = LocalDate.parse(start, formatter);
			LocalDate endD = LocalDate.parse(end, formatter);
			if(currentWS.getState().equals("Archived")){
				break;
			}
			if (endD.isBefore(LocalDate.now())) {
				currentWS.setState("Archived");
				System.out.printf("\n==============================\n"+currentWS + " Has been set to Archived.");
				break;
			}
			if (startD.isAfter(LocalDate.now())) {
				currentWS.setState("Pending");
				System.out.printf("\n==============================\n"+currentWS + " Has been set to Pending.");
				break;
			}
			if (startD.isBefore(LocalDate.now())) {
				if (endD.isAfter(LocalDate.now())) {
					currentWS.setState("Active");
					System.out.printf("\n==============================\n"+currentWS + " Has been set to Active.");
				}
			}	
		}
		
		
		}
		System.out.println("\n==============================\nArchiving Complete");
		try {
			Thread.sleep(60000);
			} catch (Exception e) {

	}

	}
}

