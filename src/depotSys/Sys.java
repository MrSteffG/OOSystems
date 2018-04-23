package depotSys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

import depotClasses.Archive;
import depotClasses.Depot;
import depotClasses.Driver;
import depotClasses.Manager;
import depotClasses.Vehicle;
import depotClasses.WorkSchedule;

public class Sys implements Runnable {
	private LinkedList<Depot> depotArray;
	private Depot depot;
	private String depotChoice;
	private Driver driver;
	private Manager manager;
	private Vehicle vehicle;
	private int i = 0;
	private LinkedList<WorkSchedule> workList;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
	Scanner sc = new Scanner(System.in);
	String menuNav = " ";

	public LinkedList<Depot> buildDepots() {
		depotArray = new LinkedList<Depot>();
		LinkedList<Vehicle> liverpoolVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> liverpoolDriver = new LinkedList<Driver>();

		String name = "liverpool";
		liverpoolDriver.add(new Manager("Steve.Lovatt", "d0nkeys", buildDriverWS("Steve.Lovatt")));
		liverpoolDriver.add(new Driver("Pete.Wilson", "Cows1", buildDriverWS("Pete.Wilson")));
		liverpoolDriver.add(new Manager("Dan.McCabe", "mongoose2", buildDriverWS("Dan.McCabe")));

		liverpoolVehicle.add(new Vehicle("CS1457", "DAYCAB", "WHALEBODY", buildVWS("CS1457")));
		liverpoolVehicle.add(new Vehicle("CS1458", "VOLVO", "FM7290", buildVWS("CS1458")));
		liverpoolVehicle.add(new Vehicle("CS1451", "Merce;des-Benz", "Actros", buildVWS("CS1451")));
		liverpoolVehicle.add(new Vehicle("CS1452", "Iveco", "PowerStar420E5", buildVWS("CS14521")));
		Depot liverpool = new Depot(name, liverpoolDriver, liverpoolVehicle, buildDWS(name));

		LinkedList<Vehicle> manchesterVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> manchesterDriver = new LinkedList<Driver>();
		name = "manchester";
		manchesterDriver.add(new Manager("Jeremy.Zuckerman", "ilovesting", buildDriverWS("Jeremy.Zuckerman")));
		manchesterDriver.add(new Driver("Sally.Cotton", "trucks4life", buildDriverWS("Sally.Cotton")));
		manchesterDriver.add(new Driver("Ruairi.Irvine", "notsouthern4", buildDriverWS("Ruairi.Irvine")));
		manchesterDriver.add(new Driver("Mark.Keenan", "not93", buildDriverWS("Mark.Keenan")));

		manchesterVehicle.add(new Vehicle("CS1459", "Tankerman", "Tankomatic5000", buildVWS("CS1459")));
		manchesterVehicle.add(new Vehicle("CS1460", "Tankerman", "Tankotron4", buildVWS("CS1460")));
		manchesterVehicle.add(new Vehicle("CS1453", "Tata", "Prima", buildVWS("CS1453")));
		manchesterVehicle.add(new Vehicle("CS1454", "Foton", "Auman", buildVWS("CS1454")));
		Depot manchester = new Depot(name, manchesterDriver, manchesterVehicle, buildDWS(name));

		LinkedList<Vehicle> birminghamVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> birminghamDriver = new LinkedList<Driver>();
		name = "birmingham";
		birminghamDriver.add(new Manager("Milo.McAleny", "made1twith", buildDriverWS("Milo.McAleny")));
		birminghamDriver.add(new Driver("Raul.Gruics", "morocco123", buildDriverWS("Raul.Gruics")));
		birminghamDriver.add(new Driver("Karl.Fitzgerald", "myname39", buildDriverWS("Karl.Fitzgerald")));
		birminghamDriver.add(new Driver("Stefarno.Gorn", "sp4repart", buildDriverWS("Stefarno.Gorn")));

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
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "05-04-2018", "07-04-2018", "CS1457", "Steve.Lovatt",
				"Active"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "07-04-2018", "10-04-2018", "CS1459",
				"Jeremy.Zuckerman", "Archived"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "09-04-2018", "10-04-2018", "CS1461",
				"Milo.McAleny", "Archived"));
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "11-04-2018", "14-04-2018", "CS1457", "Pete.Wilson",
				"Archived"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "11-04-2018", "15-04-2018", "CS1459", "Sally.Cotton",
				"Archived"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "13-04-2018", "14-04-2018", "CS1461",
				"Raul.Gruics", "Archived"));
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "14-04-2018", "16-04-2018", "CS1457", "Dan.McCabe",
				"Archived"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "18-04-2018", "21-04-2018", "CS1459", "Ruairi.Irvine",
				"Archived"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "20-04-2018", "25-04-2018", "CS1461",
				"Karl.Fitzgerald", "Active"));
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "22-04-2018", "19-24-2018", "CS1457", "Mark.Keenan",
				"Active"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "23-04-2018", "27-04-2018", "CS1459", "Stefarno.Gorn",
				"Active"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "23-04-2018", "16-04-2018", "CS1461",
				"Milo.McAleny", "Active"));
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "23-04-2018", "24-04-2018", "CS1457", "Steve.Lovatt",
				"Active"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "23-04-2018", "24-4-2018", "CS1459",
				"Jeremy.Zuckerman", "Active"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "25-04-2018", "27-04-2018", "CS1461",
				"Milo.McAleny", "Pending"));
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "27-04-2018", "29-04-2018", "CS1457", "Pete.Wilson",
				"Pending"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "27-04-2018", "28-04-2018", "CS1459", "Sally.Cotton",
				"Pending"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "28-04-2018", "30-04-2018", "CS1461",
				"Raul.Gruics", "Pending"));
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "30-04-2018", "01-05-2018", "CS1457", "Dan.McCabe",
				"Pending"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "01-05-2018", "02-05-2018", "CS1459", "Ruairi.Irvine",
				"Pending"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "02-05-2018", "03-05-2018", "CS1461",
				"Karl.Fitzgerald", "Pending"));
		workList.add(new WorkSchedule("liverpool", "Keenan Co", "02-05-2018", "04-05-2018", "CS1457", "Mark.Keenan",
				"Pending"));
		workList.add(new WorkSchedule("manchester", "RuairiCorp", "04-05-2018", "05-05-2018", "CS1459", "Stefarno.Gorn",
				"Pending"));
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "06-05-2018", "08-05-2018", "CS1461", "Milo",
				"Pending"));

		return workList;
	}

	public void run() {
		if (i == 0) {
			workList = buildSchedules();
			buildDepots();
			Archive archive = new Archive(workList);
			Thread t1 = new Thread(archive);
			t1.start();
			i++;
		}
do{
		depot = null;
		driver = null;
		System.out.println("\nPelase select a Depot");
		System.out.printf("\n1- [L]iverpool");
		System.out.printf("\n2- [M]anchester");
		System.out.printf("\n3- [B]irmingham");
		System.out.printf("\nQ- Quit");
		System.out.printf("\nPick:");

		menuNav = sc.next();
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
			run();
			break;
		}

		getDepot();
		System.out.printf("\nPlease enter your Username : ");
		String user = sc.next();

		System.out.printf("\nPlease enter your Password : ");
		String password = sc.next();

		driver = depot.logOn(user, password);

		if (driver != null) {
		if (Manager.class.isInstance(driver)) {
			manager = Manager.class.cast(driver);
			managerMenu();
			} else
				driverMenu();
		}
		else System.out.print("sorry no user matches those parameters");

			System.out.print("sorry no user matches those parameters");
	
	}	while(!menuNav.equals("Q"));
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
		do {
			System.out.printf("\nDriver Menu");
			System.out.printf("\n1- View Work Schedule");
			System.out.printf("\n2- Sign Out");
			System.out.printf("\nQ- Quit");
			System.out.printf("\nPick:");

			menuNav = sc.next();
			switch (menuNav.toUpperCase()) {
			case "1": {
				viewWS();
			}
				break;

			case "Q": {
				System.exit(0);
			}
			case "2": {
				System.out.printf("\n Signing out...");
				run();
			}
				break;
			default:
				System.out.println("not recognised, please try again");
				break;
			}
		} while (!menuNav.equals("Q"));
	}

	public void managerMenu() {
		do {
			System.out.printf("\nManager Menu:");
			System.out.printf("\n1- View Work Schedule");
			System.out.printf("\n2- Create work Schedules");
			System.out.printf("\n3- Reassign Vehicle");
			System.out.printf("\n4- check Vehicle");
			System.out.printf("\n5- Sign Out");
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
				System.exit(0);
				;
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
			case "5": {
				System.out.printf("\nSigning out...");
				run();

			}
				break;

			default:
				System.out.println("not recognised, please try again");
				
				break;
			}

		} while (!menuNav.equals("Q"));
	}

	public void moveVehicle() {
		System.out.print("\nplease enter the registration of the vehicle you wish to move");
		String regNo = sc.next();
		for (WorkSchedule currentSchedule : workList) {
			if (currentSchedule.getregNo().equals(regNo)) {
				if (!currentSchedule.getState().equals("Archived")) {
					System.out.print("\n sorry but that vehicle has Active or upcoming work and cannot be moved right now");
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
				System.out.print("Vehicle moved");
			}
		}
	}

	public void viewWS() {
		for (WorkSchedule currentSchedule : depot.getWS()) {
			if (driver.getUserName().equals(currentSchedule.getDriver())) {
				if(!currentSchedule.getState().equals("Archived"))
				System.out.print("\n" + currentSchedule.toString());
			} 

		}
	}

	public void createWS() {
		System.out.println("Please enter the start date (DD-MM-YYYY)");
		String start = sc.next();
		LocalDate startDate = LocalDate.parse(start, formatter);
		if (startDate.isAfter(LocalDate.now())) {
			System.out.println("Please enter the end date (DD-MM-YYYY)");
			String end = sc.next();
			LocalDate endDate = LocalDate.parse(end, formatter);
			if (endDate.isAfter(startDate)) {
				System.out.println("Available Vehicles:");
				LinkedList<Vehicle> checkV = depot.getArrayVehicle();

				for (Vehicle currentVehicle : checkV) {
					currentVehicle.isAvailble(startDate, endDate);
					System.out.println(currentVehicle.getinfo());
				}
				System.out.println("Please select a vehicle (Reg No)");
				String selectedV = sc.next();
				vehicle=depot.getVehicle(selectedV);
				System.out.print(vehicle.getRegNo());

				System.out.println("Available Drivers:");
				LinkedList<Driver> checkD = depot.getArrayDriver();
				for (Driver currentDriver : checkD) {
					currentDriver.isAvailble(startDate, endDate);
					System.out.println(currentDriver.getUserName());
				}
				System.out.println("Please select a driver (Username)");
				String selectedD = sc.next();
				driver=depot.getDriver(selectedD);
				System.out.print(driver.getUserName());
				System.out.println("Please enter the clients Name");
				String client=sc.next();
				WorkSchedule createdWS=depot.setupWorkSchedule(depot.getDepotName(), client, start, end, vehicle.getRegNo(),driver.getUserName(), "pending");
				driver.setWorkSchedule(createdWS);
				vehicle.setUpWS(createdWS);
				System.out.printf("\n created");
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

}
