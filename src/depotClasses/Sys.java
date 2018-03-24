package depotClasses;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import depotSystem.Depot;
import depotSystem.Driver;
import depotSystem.Vehicle;

public class Sys {
	private static Depot[] arrayDepots;

	
	public static void run() throws FileNotFoundException{
		
	
		System.out.println("Pelase select a Depot");	
		System.out.printf("\n1- [L]iverpool");
		System.out.printf("\n2- [M]anchester");
		System.out.printf("\n3- [B]irmingham");
		System.out.printf("\nQ- Quit");
		System.out.printf("\nPick:");
		Scanner sc= new Scanner(System.in);
		String menuNav=" ";
		menuNav=sc.nextLine();
		switch (menuNav.toUpperCase()) {	
			case "1":
			case "L":	
				{getDepot("liverpool");}
				break;
			case "2": 
			case "M":	
				{getDepot("manchester");}
				break;
			case "3": 
			case "B":
				{getDepot("birmingham");}
				break;
			case "Q":
				{System.exit(0);}
				break;
			default: System.out.println("not recognised, please try again");
				break;}
		
	
		
		
		
	
		}

	public static Depot getDepot(String depotChoice) {
		for (Depot currentDepot : arrayDepots) {
            if (currentDepot.getDepotName() == depotChoice) {
                return currentDepot;
            }
 }
        return null;
}
		
		
		
		
		
		
		/*Scanner driveSc = new Scanner(new FileReader(depotChoice + "Drivers.txt"));
		Scanner tankSc = new Scanner(new FileReader(depotChoice + "Tankers.txt"));
		Scanner truckSc=new Scanner(new FileReader(depotChoice+ "Trucks.txt"));
		Driver[] D= new Driver[100];	
		int i=0;
		while(driveSc.hasNext()){
			String[] data= driveSc.nextLine().split(" ");
			D[i]= new Driver(data[0],(data[1]));
			i++;
		}
		Vehicle[] V= new Vehicle[100];
		int j=0;
		while(tankSc.hasNext()){
			String[] data= tankSc.nextLine().split(" ");
			V[j]= new Vehicle(data[0],(data[1]),(data[2]));
			j++;	
		}
		while(truckSc.hasNext()){
			String[] data= truckSc.nextLine().split(" ");
			V[j]= new Vehicle(data[0],(data[1]),(data[2]));
			j++;	
		
		}
		System.out.println(Depot.getDepotName());
		return new Depot(depotChoice,D,V);
		*/
		

}
	


