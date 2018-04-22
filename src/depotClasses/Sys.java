package depotClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

import depotSystem.Archive;
import depotSystem.Depot;
import depotSystem.Driver;
import depotSystem.Manager;
import depotSystem.Vehicle;
import depotSystem.WorkSchedule;

public class Sys implements Runnable {
	private LinkedList<Depot> depotArray;
	private Depot depot;
	private String depotChoice;
	private Driver driver;
	private Manager manager;
	private Vehicle vehicle;
	private LinkedList<WorkSchedule> workList;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
	Scanner sc = new Scanner(System.in);
	String menuNav = " ";

	public LinkedList<Depot> buildDepots() {
		depotArray = new LinkedList<Depot>();
		LinkedList<Vehicle> liverpoolVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> liverpoolDriver = new LinkedList<Driver>();

		String name = "liverpool";
		liverpoolDriver.add(new Manager("Steve", "donkeys", buildDriverWS("Steve")));
		liverpoolDriver.add(new Driver("Pete", "cows1", buildDriverWS("Pete")));
		liverpoolDriver.add(new Manager("Dan", "mongoose2", buildDriverWS("Dan")));

		liverpoolVehicle.add(new Vehicle("CS1457", "DAYCAB", "WHALEBODY", buildVWS("CS1457")));
		liverpoolVehicle.add(new Vehicle("CS1458", "VOLVO", "FM7290", buildVWS("CS1458")));
		liverpoolVehicle.add(new Vehicle("CS1451", "Merce;des-Benz", "Actros", buildVWS("CS1451")));
		liverpoolVehicle.add(new Vehicle("CS1452", "Iveco", "PowerStar420E5", buildVWS("CS14521")));
		Depot liverpool = new Depot(name, liverpoolDriver, liverpoolVehicle, buildDWS(name));

		LinkedList<Vehicle> manchesterVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> manchesterDriver = new LinkedList<Driver>();
		name = "manchester";
		manchesterDriver.add(new Manager("Jeremy", "ilovesting", buildDriverWS("Jeremy")));
		manchesterDriver.add(new Driver("sally", "trucks4life", buildDriverWS("sally")));
		manchesterDriver.add(new Driver("ruairi", "iloveanime", buildDriverWS("ruairi")));
		manchesterDriver.add(new Driver("mark", "not93", buildDriverWS("mark")));

		manchesterVehicle.add(new Vehicle("CS1459", "Tankerman", "Tankomatic5000", buildVWS("CS1459")));
		manchesterVehicle.add(new Vehicle("CS1460", "Tankerman", "Tankotron4", buildVWS("CS1460")));
		manchesterVehicle.add(new Vehicle("CS1453", "Tata", "Prima", buildVWS("CS1453")));
		manchesterVehicle.add(new Vehicle("CS1454", "Foton", "Auman", buildVWS("CS1454")));
		Depot manchester = new Depot(name, manchesterDriver, manchesterVehicle, buildDWS(name));

		LinkedList<Vehicle> birminghamVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> birminghamDriver = new LinkedList<Driver>();
		name = "birmingham";
		birminghamDriver.add(new Manager("milo", "madeitwith", buildDriverWS("milo")));
		birminghamDriver.add(new Driver("rao", "morrocco123", buildDriverWS("rao")));
		birminghamDriver.add(new Driver("Hilary", "emailpass", buildDriverWS("Hilary")));
		birminghamDriver.add(new Driver("thedon", "nogunlaw", buildDriverWS("thedon")));

		birminghamVehicle.add(new Vehicle("CS1461", "Tankerman", "Wetdrive", buildVWS("CS1461")));
		birminghamVehicle.add(new Vehicle("CS1576", "Tankerman", "moistroller", buildVWS("CS1576")));
		birminghamVehicle.add(new Vehicle("CS1455", "Hyundai", "Xcient", buildVWS("CS1455")));
		birminghamVehicle.add(new Vehicle("CS1456", "Volvo", "VN780", buildVWS("CS1456")));
		Depot birmingham = new Depot(name, birminghamDriver, birminghamVehicle, buildDWS(name));

		depotArray.add(liverpool);
		depotArray.add(birmingham);
		depotArray.add(manchester);
		return depotArray;

	}

	public LinkedList<WorkSchedule> buildSchedules() {
		workList = new LinkedList<WorkSchedule>();
		workList.add(new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "active"));
		workList.add(
				new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "pending"));
		workList.add(
				new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "archived"));
		workList.add(new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "active"));
		workList.add(
				new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "pending"));
		workList.add(
				new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "archived"));
		workList.add(new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "active"));
		workList.add(
				new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "pending"));
		workList.add(
				new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "archived"));
		workList.add(new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "active"));
		workList.add(
				new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "pending"));
		workList.add(
				new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "archived"));
		workList.add(new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "active"));
		workList.add(
				new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "pending"));
		workList.add(
				new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "archived"));
		workList.add(new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "active"));
		workList.add(
				new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "pending"));
		workList.add(
				new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "archived"));
		workList.add(new WorkSchedule("liverpool", "Markyboi", "18-4-2018", "19-4-2018", "CS1457", "Steve", "active"));
		workList.add(
				new WorkSchedule("manchester", "Ruaiaiairi", "20-4-2018", "21-4-2018", "CS1459", "Jeremy", "pending"));
		workList.add(
				new WorkSchedule("birmingham", "HarryDuncalf", "1-5-2018", "3-5-2018", "CS1461", "Milo", "archived"));

		return workList;
	}

	public void run() {
		
		buildSchedules();
		buildDepots();
		Archive archive=new Archive();
		Thread t=new Thread(archive);
		t.start();
		System.out.println("Pelase select a Depot");
		System.out.printf("\n1- [L]iverpool");
		System.out.printf("\n2- [M]anchester");
		System.out.printf("\n3- [B]irmingham");
		System.out.printf("\nQ- Quit");
		System.out.printf("\nPick:");

		menuNav = sc.nextLine();
		switch (menuNav.toUpperCase()) {
		case "1":
		case "L": {
			depotChoice = "liverpool";
		}
			break;
		case "2":
		case "M": {
			depotChoice = "manchester";
		}
			break;
		case "3":
		case "B": {
			depotChoice = "birmingham";
		}
			break;
		case "Q": {
			sc.close();
			System.exit(0);
		}
			break;
		default:
			System.out.println("not recognised, please try again");
			break;
		}

		getDepot();
		System.out.println("Please enter your Username : ");
		String user = sc.next();

		System.out.println("Please enter your Password : ");
		String password = sc.next();

		// depot.logOn(user, password);
		driver = depot.logOn(user, password);
		if (Manager.class.isInstance(driver)) {
			manager = Manager.class.cast(driver);
			managerMenu();
		} else
			driverMenu();

	}

	private Depot getDepot() {
		for (Depot currentDepot : depotArray) {
			if (currentDepot.getDepotName().equals(depotChoice)) {
				depot = currentDepot;
				return currentDepot;

			}
		}
		return null;
	}

	public void driverMenu() {

		System.out.printf("\n1- View Work Schedule");
		System.out.printf("\nQ- Quit");
		System.out.printf("\nPick:");
		menuNav = sc.nextLine();
		switch (menuNav.toUpperCase()) {
		case "1": {
			viewWS();

		}
			break;
		case "Q":
		case "2": {
			run();
		}
			break;
		default:
			System.out.println("not recognised, please try again");
			break;
		}

	}

	public void managerMenu() {
		do {
			System.out.printf("\n1- View Work Schedule");
			System.out.printf("\n2- Create work Schedules");
			System.out.printf("\n3- Reassign Vehicle");
			System.out.printf("\n4- check Vehicle");
			System.out.printf("\nQ- Quit");
			System.out.printf("\nPick:");

			menuNav = sc.next();
			switch (menuNav.toUpperCase()) {
			case "1": {
				viewWS();
			}
				break;
			case "2": {
				createWS();
			}
				break;
			case "Q": {
				run();
			}
				break;
			case "3": {
				moveVehicle();
				break;
			}
			case "4": {
				System.out.print(checkVehicle());

			}
				break;
			default:
				System.out.println("not recognised, please try again");
				break;
			}
		} while (!"Q".equals(menuNav));
	}

	public void moveVehicle() {
		System.out.print("\nplease enter the registration of the vehicle you wish to move");
		String regNo = sc.next();
		for (WorkSchedule currentSchedule : workList) {
			if (currentSchedule.getregNo().equals(regNo)) {
				if (!currentSchedule.getState().equals("archived")) {
					System.out.print("\n sorry but that busy as Active or upcoming work and cannot be moved right now");
					return;
				}

			}
			if (depot.getVehicle(regNo) != null) {
				vehicle = depot.getVehicle(regNo);
				System.out.print("please select a depot to move this vehicle to");
				String oldDepot = depotChoice;
				depot.getArrayVehicle().remove(vehicle);
				depotChoice = sc.next();
				getDepot();
				depot.getArrayVehicle().add(vehicle);
				depotChoice = oldDepot;
				getDepot();
				System.out.print("it wokred maybe");
				managerMenu();
			}
		}

	}

	public void viewWS() {
		for (WorkSchedule currentSchedule : workList) {
			if (driver.getUser().equals(currentSchedule.getDriver())) {
				System.out.print("\n" + currentSchedule.toString());
			} else
				;

		}
	}

	public void createWS() {
		// request start date
		String start = sc.next();
		LocalDate startDate = LocalDate.parse(start, formatter);
		if (startDate.isAfter(LocalDate.now())) {
			// request end date
			String end = sc.next();
			LocalDate endDate = LocalDate.parse(end, formatter);
			if (endDate.isAfter(startDate)) {

				LinkedList<Vehicle> checkV = depot.getArrayVehicle();
				for (Vehicle currentVehicle : checkV) {
					currentVehicle.isAvailble(startDate, endDate);
					System.out.print(currentVehicle.getinfo());
					String selectedV = sc.next();

				}

				LinkedList<Driver> checkD = depot.getArrayDriver();
				for (Driver currentDriver : checkD) {
					currentDriver.isAvailble(startDate, endDate);
					System.out.print(currentDriver.getUser());
					String selectedD = sc.next();
				}

				// please select a vehicle

				// please select a driver

			}

		}
	}

	public String checkVehicle() {
		System.out.print("regNo");
		String regNo = sc.next();
		if (depot.getVehicle(regNo) != null) {
			return "its still there";

		} else
			return "its gone";
	}

	public LinkedList<WorkSchedule> buildDriverWS(String name) { // for building
																	// test
																	// drivers
																	// WS
		LinkedList<WorkSchedule> driveList = new LinkedList<WorkSchedule>();
		for (WorkSchedule currentSchedule : workList) {
			if (currentSchedule.getDriver().equals(name)) {
				driveList.add(currentSchedule);
			}

		}

		return driveList;
	}

	public LinkedList<WorkSchedule> buildVWS(String regNo) {// build test
															// vehicles WS
		LinkedList<WorkSchedule> vList = new LinkedList<WorkSchedule>();
		for (WorkSchedule currentSchedule : workList) {
			if (currentSchedule.getregNo().equals(regNo)) {
				vList.add(currentSchedule);
			}

		}

		return vList;
	}

	public LinkedList<WorkSchedule> buildDWS(String depot) {// build test depots
															// WS
		LinkedList<WorkSchedule> dList = new LinkedList<WorkSchedule>();
		for (WorkSchedule currentSchedule : workList) {
			if (currentSchedule.getDepot().equals(depot)) {
				dList.add(currentSchedule);
			}

		}

		return dList;
	}

/*	public void archiver() {
		for (WorkSchedule currentWS : workList) {
			String start = currentWS.getStartDate();
			String end = currentWS.getEndDate();
			LocalDate startD = LocalDate.parse(start, formatter);
			LocalDate endD = LocalDate.parse(end, formatter);
			if (endD.isBefore(LocalDate.now())) {
				currentWS.setState("archived");
				break;
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

		}

	}*/

}
