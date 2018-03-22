package depotClasses;
import java.io.FileNotFoundException;
import java.util.Scanner;

import depotSystem.Depot;

public class Entry {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		/*do {
			System.out.println("Pelase select a Depot");	
			
			System.out.printf("\n1- [L]iverpool");
			System.out.printf("\n2- [M]anchester");
			System.out.printf("\n3- [B]ristol");
			System.out.printf("\nQ- Quit");
			System.out.printf("\nPick:");
			*/
		String pass=" ";
		String user=" ";
		user=sc.nextLine();
		pass=sc.nextLine();
			
	
			
			Depot.logon(user,pass);
			
			
			/*switch (menuNav.toUpperCase()) {	
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
		 
		 */
		sc.close();
	

}
}
