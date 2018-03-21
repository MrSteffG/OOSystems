package depotSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;


public class Driver {
 private String userName;
 private String password;
 private String jobState;


 public Driver(String userName, String password, String jobState){
	 this.userName= userName;
	 this.password= password;  
	 this.jobState=jobState;
 };
 
 public static boolean checkPassword(String username, String pass) throws FileNotFoundException{
boolean passOkay = false;
boolean userOkay = false;
/*		@SuppressWarnings("rawtypes")
		LinkedList list= new LinkedList(); */
	 Scanner sc = new Scanner(new FileReader("M:\\data\\drivers"));
Driver[] D= new Driver[100];	
			int i=0;	
			while(sc.hasNext()){
				String[] data= sc.nextLine().split(" ");
				D[i]= new Driver(data[0],(data[1]),(data[2]));
				i++;
			}
			
			for (i=0; i<D.length; i++){
				if (D[i].userName.equals(username)){
					userOkay=true;
					if (userOkay=true){
						if (D[i].password.equals(pass)){passOkay=true;};
						
					}
					}
				}
			sc.close();	
			if( passOkay && userOkay==true) {return true;}
			else return false;
		
			
 }
 
 public String getUser(){
	 return userName;}
 
}

