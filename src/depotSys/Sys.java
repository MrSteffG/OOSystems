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
import depotClasses.Tanker;
import depotClasses.Truck;
import depotClasses.Vehicle;
import depotClasses.WorkSchedule;

public class Sys implements Runnable {
	private static LinkedList<Depot> depotArray;
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

	public LinkedList<Depot> buildDepots() {// building test data
		depotArray = new LinkedList<Depot>();
		LinkedList<Vehicle> liverpoolVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> liverpoolDriver = new LinkedList<Driver>();

		String name = "liverpool";
		liverpoolDriver.add(new Manager("Steve.Lovatt", "d0nkeys", buildDriverWS("Steve.Lovatt")));
		liverpoolDriver.add(new Driver("Pete.Wilson", "Cows1", buildDriverWS("Pete.Wilson")));
		liverpoolDriver.add(new Manager("Dan.McCabe", "mongoose2", buildDriverWS("Dan.McCabe")));

		liverpoolVehicle.add(new Tanker("CS1457", "DAYCAB", "WHALEBODY", buildVWS("CS1457"), 700, 1900, "Soy Sauce"));
		liverpoolVehicle.add(new Tanker("CS1458", "VOLVO", "FM7290", buildVWS("CS1458"), 500, 700, "Sunflower Oil"));
		liverpoolVehicle.add(new Truck("CS1451", "Merce;des-Benz", "Actros", buildVWS("CS1451"), 420, 790));
		liverpoolVehicle.add(new Truck("CS1452", "Iveco", "PowerStar420E5", buildVWS("CS14521"), 600, 1005));
		Depot liverpool = new Depot(name, liverpoolDriver, liverpoolVehicle, buildDWS(name));

		LinkedList<Vehicle> manchesterVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> manchesterDriver = new LinkedList<Driver>();
		name = "manchester";
		manchesterDriver.add(new Manager("Jeremy.Zuckerman", "ilovesting", buildDriverWS("Jeremy.Zuckerman")));
		manchesterDriver.add(new Driver("Sally.Cotton", "trucks4life", buildDriverWS("Sally.Cotton")));
		manchesterDriver.add(new Driver("Ruairi.Irvine", "notsouthern4", buildDriverWS("Ruairi.Irvine")));
		manchesterDriver.add(new Driver("Mark.Keenan", "not93", buildDriverWS("Mark.Keenan")));

		manchesterVehicle
				.add(new Tanker("CS1459", "Tankerman", "Tankomatic5000", buildVWS("CS1459"), 680, 800, "Crude Oil"));
		manchesterVehicle.add(new Tanker("CS1460", "Tankerman", "Tankotron4", buildVWS("CS1460"), 900, 1600, "milk"));
		manchesterVehicle.add(new Truck("CS1453", "Tata", "Prima", buildVWS("CS1453"), 390, 700));
		manchesterVehicle.add(new Truck("CS1454", "Foton", "Auman", buildVWS("CS1454"), 590, 1000));
		Depot manchester = new Depot(name, manchesterDriver, manchesterVehicle, buildDWS(name));

		LinkedList<Vehicle> birminghamVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> birminghamDriver = new LinkedList<Driver>();
		name = "birmingham";
		birminghamDriver.add(new Manager("Milo.McAleny", "made1twith", buildDriverWS("Milo.McAleny")));
		birminghamDriver.add(new Driver("Raul.Gruics", "morocco123", buildDriverWS("Raul.Gruics")));
		birminghamDriver.add(new Driver("Karl.Fitzgerald", "myname39", buildDriverWS("Karl.Fitzgerald")));
		birminghamDriver.add(new Driver("Stefarno.Gorn", "sp4repart", buildDriverWS("Stefarno.Gorn")));

		birminghamVehicle.add(new Tanker("CS1461", "Tankerman", "Wetdrive", buildVWS("CS1461"), 600, 900, "Wet"));
		birminghamVehicle.add(
				new Tanker("CS1576", "Tankerman", "moistroller", buildVWS("CS1576"), 700, 1500, "Lubricating Gel"));
		birminghamVehicle.add(new Truck("CS1455", "Hyundai", "Xcient", buildVWS("CS1455"), 700, 800));
		birminghamVehicle.add(new Truck("CS1456", "Volvo", "VN780", buildVWS("CS1456"), 370, 900));
		Depot birmingham = new Depot(name, birminghamDriver, birminghamVehicle, buildDWS(name));

		depotArray.add(liverpool);
		depotArray.add(birmingham);
		depotArray.add(manchester);
		return depotArray;

	}

	public LinkedList<WorkSchedule> buildSchedules() {// building test data
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
		workList.add(new WorkSchedule("birmingham", "DuncalfDougnuts", "06-05-2018", "08-05-2018", "CS1461",
				"Milo.McAleny", "Pending"));

		return workList;
	}


	public synchronized void run() {// main menu
		if (i == 0) {// builds schedules and depots only once when ran
		buildSchedules();
			buildDepots();
			i++;
		}
		do {
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
			} else
				System.out.print("sorry no user matches those parameters");
		} while (!menuNav.equals("Q"));
	}

	public Depot getDepot() {
		for (Depot currentDepot : depotArray) {
			if (currentDepot.getDepotName().equals(depotChoice)) {
				depot = currentDepot;
				return currentDepot;

			}
		}
		return null;
	}

	public static LinkedList<Depot> getDepotList() {// Array of depots for login
													// and archiving
		return depotArray;
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
			System.out.printf("\n2- Create Work Schedules");
			System.out.printf("\n3- Reassign Vehicle");
			System.out.printf("\n4- Check Vehicle");
			System.out.printf("\n5- add Vehicle");
			System.out.printf("\n6- add Driver");
			System.out.printf("\n7- Sign Out");
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

			}
				break;
			case "4": {
				checkVehicle();
			}
				break;
			case "5": {
				addVehicle();
			}
				break;
			case "6": {
				addDriver();
			}

				break;
			case "7": {
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

	private void addVehicle() {
		System.out.print("please enter Vehicle registration");
		String regNo = sc.next();
		System.out.print("Please enter vehicle Make");
		String make = sc.next();
		System.out.print("Please enter vehicle Model");
		String model = sc.next();
		System.out.print("Please enter vehicle Weight(Kg)");
		int weight = Integer.parseInt(sc.next());
		System.out.print("Please enter if vehicle is a truck or a tanker");
		String type = sc.next().toUpperCase();

		if (type.equals("TRUCK")) {// Differentiate between vehicle subclasses
			System.out.print("Please enter vehicle Cargo Capacity(Kg");
			Integer cC = Integer.parseInt(sc.next());
			Truck add = new Truck(regNo, make, model, null, weight, cC);
			depot.setListVehicle(add);

		}
		if (type.equals("TANKER")) {// Differentiate between vehicle subclasses
			System.out.print("Please enter vehicles Liquid Capacity");
			Integer lC = Integer.parseInt(sc.next());
			System.out.print("Please enter the name of the type of liquid the vehicle carries");
			String liquid = sc.next();
			Tanker add = new Tanker(regNo, make, model, null, weight, lC, liquid);
			depot.setListVehicle(add);

		}

	}

	public void addDriver() {// creates new driver and adds it to active depot
		System.out.print("please eneter userName");
		String name = sc.next();
		System.out.print("Please enter password");
		String pass = sc.next();
		LinkedList<WorkSchedule> list = new LinkedList<WorkSchedule>();
		Driver made = new Driver(name, pass, list);
		depot.setListDriver(made);
	}

	public void moveVehicle() {
		System.out.println("Available Vehicles:");
		LinkedList<Vehicle> checkV = depot.getListVehicle();

		for (Vehicle currentVehicle : checkV) {
			if (currentVehicle.moveable()) {
				System.out.println(currentVehicle.getinfo());
			}

		}
		System.out.println("\nplease enter the registration of the vehicle you wish to move:");
		String regNo = sc.next();

		if (depot.getVehicle(regNo) != null) {
			vehicle = depot.getVehicle(regNo);
			System.out.print("please select a depot to move this vehicle to:");
			String oldDepot = depotChoice; // store previous depot
			depot.getListVehicle().remove(vehicle);
			depotChoice = sc.next();
			getDepot();
			depot.getListVehicle().add(vehicle);
			depotChoice = oldDepot;
			getDepot();
			System.out.print("Vehicle moved!");

		}
	}

	public void viewWS() {
		for (WorkSchedule currentSchedule : depot.getWS()) {
			if (driver.getUserName().equals(currentSchedule.getDriver())) {
				if (!currentSchedule.getState().equals("Archived"))
					System.out.print("\n" + currentSchedule.toString());
			}

		}
	}

	public void createWS() {// creates a new Work schedule for driver,
		System.out.println("Please enter the start date (DD-MM-YYYY)");
		String start = sc.next();
		LocalDate startDate = LocalDate.parse(start, formatter);//parses input String to LocalDate
		if (startDate.isAfter(LocalDate.now().plusDays(2))) {//job can't be started in next 48 hours from now
			System.out.println("Please enter the end date (DD-MM-YYYY)");
			String end = sc.next();
			LocalDate endDate = LocalDate.parse(end, formatter);
			if (endDate.isAfter(startDate)) {//ensures start date is before end date

				System.out.println("Available Vehicles:");
				LinkedList<Vehicle> checkV = depot.getListVehicle();
				for (Vehicle currentVehicle : checkV) {
					currentVehicle.isAvailble(startDate, endDate);
					System.out.println(currentVehicle.getinfo());
					// Prints list of available vehicles
				}

				System.out.println("Please select a vehicle (Reg No)");
				String selectedV = sc.next();

				vehicle = depot.getVehicle(selectedV);

				if (vehicle != null) {// checks vehicle exists in depot

					System.out.println("Available Drivers:");
					LinkedList<Driver> checkD = depot.getListDriver();
					for (Driver currentDriver : checkD) {
						currentDriver.isAvailble(startDate, endDate);
						System.out.println(currentDriver.getUserName());// Prints
																		// list
																		// of
																		// available
																		// drivers
					}

					System.out.println("Please select a driver (Username)");
					String selectedD = sc.next();

					driver = depot.getDriver(selectedD);
					if (driver != null) {// checks driver exists in depot

					} else {
						System.out.println("That driver doesn't exist, please enter another driver:");
						selectedD = sc.next();
						vehicle = depot.getVehicle(selectedD);
					}

					System.out.println("Please enter the clients Name");

					String client = sc.next();
					WorkSchedule createdWS = depot.setWorkSchedule(depot.getDepotName(), client, start, end,
							vehicle.getRegNo(), driver.getUserName(), "pending");
					driver.setWorkSchedule(createdWS);

					vehicle.setWorkSchedule(createdWS);
					System.out.println("Work Schedule created:");
					System.out.println(createdWS);

				} else {

				}
			}
			System.out.print("That end date is before your start date! Please start over.");
			{

				System.out.print("A job cannot be started in the next 48 hours");
			}
		}

	}

	public void checkVehicle() {// mostly for test. Checks is vehicle by regNo
								// is present at active depot
		System.out.print("regNo");
		String regNo = sc.next();
		if (depot.getVehicle(regNo) != null) {
			System.out.printf("\nIt belongs to us");
		} else
			System.out.printf("No Vehicle of that registration found");
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
			if (currentSchedule.getRegNo().equals(regNo)) {
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
