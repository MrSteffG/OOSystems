package depotClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

public class Archive implements Runnable {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
	private LinkedList<WorkSchedule> workList;

	public Archive(LinkedList<WorkSchedule> workList) {
		for (WorkSchedule currentWS : workList) {
			String start = currentWS.getStartDate();
			String end = currentWS.getEndDate();
			LocalDate startD = LocalDate.parse(start, formatter);
			LocalDate endD = LocalDate.parse(end, formatter);
			if (endD.isBefore(LocalDate.now())) {
				currentWS.setState("Archived");
				System.out.println(currentWS + " Has been set to Archived.");
				break;
			}
			if (startD.isAfter(LocalDate.now())) {
				currentWS.setState("Pending");
				System.out.println(currentWS + " Has been set to Pending.");
				break;
			}
			if (startD.isBefore(LocalDate.now())) {
				if (endD.isAfter(LocalDate.now())) {
					currentWS.setState("Active");
					System.out.println(currentWS + " Has been set to Active.");
				}
			}	
		}
		
		System.out.println("Archiving Complete");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {

	}
}
