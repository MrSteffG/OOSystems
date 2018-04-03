package depotClasses;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import depotSystem.Depot;
import depotSystem.Driver;
import depotSystem.Vehicle;

public class Sys {
	private static Depot[] depotArray;
	private static Driver[] arrayDriver;
	private static Vehicle[] arrayVehicle;
	private static String depotName;
	private static Depot liverpool;
	private static Depot birmingham;
	private static Depot manchester;

	public static void run() throws FileNotFoundException {

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
			getDepot("liverpool");
		}
			break;
		case "2":
		case "M": {
			getDepot("manchester");
		}
			break;
		case "3":
		case "B": {
			getDepot("birmingham");
		}
			break;
		case "Q": {
			System.exit(0);
		}
			break;
		default:
			System.out.println("not recognised, please try again");
			break;
		}
	}

	public static Depot getDepot(String depotChoice) {
		arrayVehicle = new Vehicle[6];
		arrayDriver = new Driver[5];

		depotName = "liverpool";
		arrayDriver[0] = new Driver("Steve", "donkeys");
		arrayDriver[1] = new Driver("Pete", "cows1");
		arrayDriver[2] = new Driver("Dan", "mongoose2");

		arrayVehicle[0] = new Vehicle("CS1457", "DAYCAB", "WHALEBODY");
		arrayVehicle[1] = new Vehicle("CS1458", "VOLVO", "FM7290");
		arrayVehicle[2] = new Vehicle("CS1451", "Merce;des-Benz", "Actros");
		arrayVehicle[3] = new Vehicle("CS1452", "Iveco", "PowerStar420E5");
		liverpool = new Depot(depotName, arrayDriver, arrayVehicle);

		depotName = "birmingham";
		arrayDriver[0] = new Driver("milo", "madeitwith");
		arrayDriver[1] = new Driver("rao", "morrocco123");
		arrayDriver[2] = new Driver("Hilary", "emailpass");
		arrayDriver[3] = new Driver("thedon", "nogunlaw");

		arrayVehicle[0] = new Vehicle("CS1461", "Tankerman", "Wetdrive");
		arrayVehicle[1] = new Vehicle("CS1576", "Tankerman", "moistroller");
		arrayVehicle[2] = new Vehicle("CS1455", "Hyundai", "Xcient");
		arrayVehicle[3] = new Vehicle("CS1456 ", "Volvo", "VN780");
		birmingham = new Depot(depotName, arrayDriver, arrayVehicle);

		depotName = "manchester";
		arrayDriver[0] = new Driver("Jeremy", "ilovesting");
		arrayDriver[1] = new Driver("sally", "trucks4life");
		arrayDriver[2] = new Driver("ruairi", "iloveanime");
		arrayDriver[3] = new Driver("mark", "not93");

		arrayVehicle[0] = new Vehicle("CS1459", "Tankerman", "Tankomatic5000");
		arrayVehicle[1] = new Vehicle("CS1460", "Tankerman", "Tankotron4");
		arrayVehicle[2] = new Vehicle("CS1453", "Tata", "Prima");
		arrayVehicle[3] = new Vehicle("CS1454", "Foton", "Auman");
		manchester = new Depot(depotName, arrayDriver, arrayVehicle);

		depotArray = new Depot[5];
		depotArray[0] = birmingham;
		depotArray[1] = liverpool;
		depotArray[2] = manchester;

		for (Depot currentDepot : depotArray) {
			if (Depot.getDepotName() == depotChoice) {
				System.out.println(Depot.getDepotName());
				return currentDepot;
			}
		}
		return null;
	}
}

/*
 * Scanner driveSc = new Scanner(new FileReader(depotChoice + "Drivers.txt"));
 * Scanner tankSc = new Scanner(new FileReader(depotChoice + "Tankers.txt"));
 * Scanner truckSc=new Scanner(new FileReader(depotChoice+ "Trucks.txt"));
 * Driver[] D= new Driver[100]; int i=0; while(driveSc.hasNext()){ String[]
 * data= driveSc.nextLine().split(" "); D[i]= new Driver(data[0],(data[1]));
 * i++; } Vehicle[] V= new Vehicle[100]; int j=0; while(tankSc.hasNext()){
 * String[] data= tankSc.nextLine().split(" "); V[j]= new
 * Vehicle(data[0],(data[1]),(data[2])); j++; } while(truckSc.hasNext()){
 * String[] data= truckSc.nextLine().split(" "); V[j]= new
 * Vehicle(data[0],(data[1]),(data[2])); j++;
 * 
 * } System.out.println(Depot.getDepotName()); return new
 * Depot(depotChoice,D,V);
 */
