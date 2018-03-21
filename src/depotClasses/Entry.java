package depotClasses;
import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuNav=sc.nextLine();
		do {
			System.out.println("Pelase select a Depot");	
			
			System.out.printf("\n1- [L]iverpool");
			System.out.printf("\n2- [M]anchester");
			System.out.printf("\n3- [B]ristol");
			System.out.printf("\nQ- Quit");
			System.out.printf("\nPick:");
		
			
			
			switch (menuNav.toUpperCase()) {	
				case "1":
				case "L":	
					{}
					break;
				case "2": 
				case "M":	
					{}
					break;
				case "3": 
				case "B":
					{}
					break;
				case "Q":
					{System.exit(0);}
					break;
				default: System.out.println("not recognised, please try again");
					break;
					
					
			}
			
			}while(!"Q".equals(menuNav));
		sc.close();
	

}
}
