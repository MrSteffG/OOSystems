package depotClasses;

import java.util.Scanner;

import depotSystem.Depot;
import depotSystem.Driver;

public class Sys {
	
	public void run(){
		Scanner sc= new Scanner(System.in);
		while(true){
		String menuNav=sc.nextLine();
		do {
		System.out.println("Pelase select a Depot");	
		System.out.printf("\n1- [L]iverpool");
		System.out.printf("\n2- [M]anchester");
		System.out.printf("\n3- [B]irmingham");
		System.out.printf("\nQ- Quit");
		System.out.printf("\nPick:");
	
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
				break;
				}
		}
		while(!"Q".equals(menuNav));
	 
	 
	sc.close();
		
		
		
	}
		}

	public Depot getDepot(String depotChoice){
		
		
	
	
		}
		
	
	}


