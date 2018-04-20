package depotClasses;

import java.util.LinkedList;
import java.util.Scanner;
import depotSystem.Depot;
import depotSystem.Driver;
import depotSystem.Manager;
import depotSystem.Vehicle;

public class Sys {
	private Depot[] depotArray;
	private Depot depot;
	private String depotChoice;
	private Driver driver;
	private Manager manager;
	private Vehicle vehicle;
	Scanner sc = new Scanner(System.in);
	String menuNav = " ";

	public static Depot buildLiv() {

		LinkedList<Vehicle> liverpoolVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> liverpoolDriver = new LinkedList<Driver>();

		String name = "liverpool";
		liverpoolDriver.add(new Manager("Steve", "donkeys"));
		liverpoolDriver.add(new Manager("Pete", "cows1"));
		liverpoolDriver.add(new Manager("Dan", "mongoose2"));

		liverpoolVehicle.add(new Vehicle("CS1457", "DAYCAB", "WHALEBODY"));
		liverpoolVehicle.add(new Vehicle("CS1458", "VOLVO", "FM7290"));
		liverpoolVehicle.add(new Vehicle("CS1451", "Merce;des-Benz", "Actros"));
		liverpoolVehicle.add(new Vehicle("CS1452", "Iveco", "PowerStar420E5"));
		Depot liverpool = new Depot(name, liverpoolDriver, liverpoolVehicle);
		return liverpool;
	}

	public static Depot buildMan() {

		LinkedList<Vehicle> manchesterVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> manchesterDriver = new LinkedList<Driver>();
		String name = "manchester";
		manchesterDriver.add(new Driver("Jeremy", "ilovesting"));
		manchesterDriver.add(new Driver("sally", "trucks4life"));
		manchesterDriver.add(new Driver("ruairi", "iloveanime"));
		manchesterDriver.add(new Driver("mark", "not93"));

		manchesterVehicle.add(new Vehicle("CS1459", "Tankerman", "Tankomatic5000"));
		manchesterVehicle.add(new Vehicle("CS1460", "Tankerman", "Tankotron4"));
		manchesterVehicle.add(new Vehicle("CS1453", "Tata", "Prima"));
		manchesterVehicle.add(new Vehicle("CS1454", "Foton", "Auman"));
		Depot manchester = new Depot(name, manchesterDriver, manchesterVehicle);
		return manchester;
	}

	public static Depot buildBirm() {
		LinkedList<Vehicle> birminghamVehicle = new LinkedList<Vehicle>();
		LinkedList<Driver> birminghamDriver = new LinkedList<Driver>();
		String name = "birmingham";
		birminghamDriver.add(new Driver("milo", "madeitwith"));
		birminghamDriver.add(new Driver("rao", "morrocco123"));
		birminghamDriver.add(new Driver("Hilary", "emailpass"));
		birminghamDriver.add(new Driver("thedon", "nogunlaw"));

		birminghamVehicle.add(new Vehicle("CS1461", "Tankerman", "Wetdrive"));
		birminghamVehicle.add(new Vehicle("CS1576", "Tankerman", "moistroller"));
		birminghamVehicle.add(new Vehicle("CS1455", "Hyundai", "Xcient"));
		birminghamVehicle.add(new Vehicle("CS1456", "Volvo", "VN780"));
		Depot birmingham = new Depot(name, birminghamDriver, birminghamVehicle);
		return birmingham;

	}

	public void run() {
		
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
			if (currentDepot.getDepotName() == depotChoice) {
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
		case "1": { // put in viewSchedule when made

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
		;

	}

	public void viewWS() {

	}

	public void createWS() {

	};

	public String checkVehicle() {
		System.out.print("regNo");
		String regNo = sc.next();
		if (depot.getVehicle(regNo) != null) {
			return "its still there";

		} else
			return "its gone";
	}
}
