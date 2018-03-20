package depotSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {
 private String userName;
 private  String password;


 public Driver(String userName, String password, String jobState){
	 this.userName= userName;
	 this.password= password;  
 };
 
 public static boolean checkPassword(String username, String pass) throws FileNotFoundException{
boolean passOkay = false;
		@SuppressWarnings("rawtypes")
		LinkedList list= new LinkedList();
 
	 Scanner sc = new Scanner(new FileReader("M:\\data\\drivers"));
		String next;
	 while (sc.hasNextLine()){
			next = sc.nextLine();
			list.add(next);
			if(next.equals(username)){
				if (sc.next().split(" ").equals(pass)){ return passOkay=true;}
				else return passOkay=false;}
			return passOkay;
			}
		sc.close();
		return passOkay;
		
 }
 
 public String getUser(){
	 return userName;}
 
}

