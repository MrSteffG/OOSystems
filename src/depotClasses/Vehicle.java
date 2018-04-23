package depotClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

public class Vehicle {
	private String regNo;
	private String model;
	private String make;
	private int weight;
	private String jobState;
	protected LinkedList<WorkSchedule> wsList;

	/**
	 * Constructs a vehicle consisting of registration number, model, make, work schedule, weight, job state and cargo type.
	 * @param regNo the registration number used to identify the vehicle.
	 * @param model the model of the vehicle.
	 * @param make the make of the vehicle.
	 * @param wsList the work schedule this vehicle adheres to.
	 * @param weight the weight of this vehicle
	 * @param jobState the job state of this vehicle
	 */
	public Vehicle(String regNo, String model, String make, LinkedList<WorkSchedule> wsList) {
		this.regNo = regNo;
		this.model = model;
		this.make = make;
		this.wsList = wsList;

	};

	public String getRegNo() {
		return regNo;

	}
	public String getinfo(){
		return regNo + make + model;
		
	}

	public boolean isAvailble(LocalDate newSD, LocalDate newED) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
		for (WorkSchedule currentWS : wsList) {
			String start = currentWS.getStartDate();
			String end = currentWS.getEndDate();
			LocalDate startDate = LocalDate.parse(start, formatter);
			LocalDate endDate = LocalDate.parse(end, formatter);
			if (newSD.isAfter(startDate)) {
				if (newSD.isBefore(endDate)) {
					return false;
				}
			}
			if (newSD.isBefore(startDate)) {
				if (newED.isAfter(endDate)) {
					return false;
				}
				if (newED.isAfter(startDate)) {
					return false;
				}
			}

			else
				return true;

		}
		return false;
	}

}
