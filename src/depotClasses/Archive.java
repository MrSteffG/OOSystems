package depotClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

public class Archive implements Runnable {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
	private LinkedList<WorkSchedule> workList;

	public void  run() {
		
		
		for (WorkSchedule currentWS : workList) {
			String start = currentWS.getStartDate();
			String end = currentWS.getEndDate();
			LocalDate startD = LocalDate.parse(start, formatter);
			LocalDate endD = LocalDate.parse(end, formatter);
			if (endD.isBefore(LocalDate.now())) {
				currentWS.setState("archived");				break;
			}
			if (startD.isAfter(LocalDate.now())) {
				currentWS.setState("pending");
				break;
			}
			if (startD.isBefore(LocalDate.now())) {
				if (endD.isAfter(LocalDate.now())) {
					currentWS.setState("active");
				}
			}
			System.out.print("hello");
try{Thread.sleep(30000);} catch (Exception e){}
		}
		
	}

		
	}

	

