package depotClasses;

import java.io.FileNotFoundException;
import java.util.Scanner;

import depotSystem.Depot;

public class Sys {
private static Depot[] depotArray;
	

	
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
			Depot.logon();
		}
			break;
		case "2":
		case "M": {
			getDepot("manchester");
			Depot.logon();
		}
			break;
		case "3":
		case "B": {
			getDepot("birmingham");
			Depot.logon();
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
	}

	private static Depot getDepot(String depotChoice) {
		depotArray= new Depot[3];
		depotArray[0]=Depot.buildLiv();
		depotArray[1]= Depot.buildMan();
		depotArray[2]= Depot.buildBirm();

		 for (Depot currentDepot : depotArray) {
	            if (currentDepot.getDepotName() == depotChoice) {
	            	System.out.println(currentDepot.getDepotName());
	                return currentDepot;
	            }
	        }
		 System.out.println("null boys");

	        return null;
	}
}

