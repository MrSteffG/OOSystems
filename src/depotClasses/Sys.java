package depotClasses;

import java.util.Arrays;
import java.util.Scanner;
import depotSystem.Depot;
import depotSystem.Driver;
import depotSystem.Manager;
import depotSystem.Vehicle;
import depotSystem.WorkSchedule;


public class Sys {
	private Depot[] depotArray;
	private Depot depot;
	private String depotChoice;
	private Driver driver;
	private Manager manager;

	public static Depot buildLiv() {

		Vehicle[] liverpoolVehicle = new Vehicle[4];
		Driver[] liverpoolDriver = new Driver[3];

		String name = "liverpool";
		liverpoolDriver[0] = new Manager("Steve", "donkeys");
		liverpoolDriver[1] = new Driver("Pete", "cows1");
		liverpoolDriver[2] = new Driver("Dan", "mongoose2");

		liverpoolVehicle[0] = new Vehicle("CS1457", "DAYCAB", "WHALEBODY");
		liverpoolVehicle[1] = new Vehicle("CS1458", "VOLVO", "FM7290");
		liverpoolVehicle[2] = new Vehicle("CS1451", "Merce;des-Benz", "Actros");
		liverpoolVehicle[3] = new Vehicle("CS1452", "Iveco", "PowerStar420E5");
		Depot liverpool = new Depot(name, liverpoolDriver, liverpoolVehicle);
		return liverpool;
	}

	public static Depot buildMan() {

		Vehicle[] manchesterVehicle = new Vehicle[4];
		Driver[] manchesterDriver = new Driver[4];
		String name = "manchester";
		manchesterDriver[0] = new Driver("Jeremy", "ilovesting");
		manchesterDriver[1] = new Driver("sally", "trucks4life");
		manchesterDriver[2] = new Driver("ruairi", "iloveanime");
		manchesterDriver[3] = new Driver("mark", "not93");

		manchesterVehicle[0] = new Vehicle("CS1459", "Tankerman", "Tankomatic5000");
		manchesterVehicle[1] = new Vehicle("CS1460", "Tankerman", "Tankotron4");
		manchesterVehicle[2] = new Vehicle("CS1453", "Tata", "Prima");
		manchesterVehicle[3] = new Vehicle("CS1454", "Foton", "Auman");
		Depot manchester = new Depot(name, manchesterDriver, manchesterVehicle);
		return manchester;
	}

	public static Depot buildBirm() {
		Vehicle[] birminghamVehicle = new Vehicle[4];
		Driver[] birminghamDriver = new Driver[4];
		String name = "birmingham";
		birminghamDriver[0] = new Driver("milo", "madeitwith");
		birminghamDriver[1] = new Driver("rao", "morrocco123");
		birminghamDriver[2] = new Driver("Hilary", "emailpass");
		birminghamDriver[3] = new Driver("thedon", "nogunlaw");

		birminghamVehicle[0] = new Vehicle("CS1461", "Tankerman", "Wetdrive");
		birminghamVehicle[1] = new Vehicle("CS1576", "Tankerman", "moistroller");
		birminghamVehicle[2] = new Vehicle("CS1455", "Hyundai", "Xcient");
		birminghamVehicle[3] = new Vehicle("CS1456", "Volvo", "VN780");
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
		Scanner sc = new Scanner(System.in);
		String menuNav = " ";
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
		depotArray = new Depot[3];
		depotArray[0] = Depot.buildLiv();
		depotArray[1] = Depot.buildMan();
		depotArray[2] = Depot.buildBirm();

		for (Depot currentDepot : depotArray) {
			if (currentDepot.getDepotName() == depotChoice) {
				System.out.println(currentDepot.getDepotName());
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
		Scanner sc = new Scanner(System.in);
		String menuNav = " ";
		menuNav = sc.nextLine();
		switch (menuNav.toUpperCase()) {
		case "1": { // put in viewSchedule when made
			//System.out.println(WorkSchedule.WS());
		}
			break;
		case "Q":
		case "2": {
			sc.close();
			System.exit(0);
		}
			break;
		default:
			System.out.println("not recognised, please try again");
			break;
		}

	}

	public void managerMenu() {

		System.out.printf("\n1- View Work Schedule");
		System.out.printf("\n 2- Create work Schedules");
		System.out.printf("\n 2- Reassign Vehicle");
		System.out.printf("\nQ- Quit");
		System.out.printf("\nPick:");
		Scanner sc = new Scanner(System.in);
		String menuNav = " ";
		menuNav = sc.nextLine();
		switch (menuNav.toUpperCase()) {
		case "1": { // put in viewSchedule when made

		}
		case "2": { // put in create work Schedule when made

		}
			break;
		case "Q":
		case "3": {
			sc.close();
			System.exit(0);
		}
			break;
		default:
			System.out.println("not recognised, please try again");
			break;
		}
	}
}
