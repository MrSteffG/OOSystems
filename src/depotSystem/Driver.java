package depotSystem;

public class Driver {
 private String userName;
 private static String password;
 private int ID;


 public Driver(String userName, String password, int ID, String jobState){
	 this.userName= userName;
	 Driver.password= password;
	 this.ID= ID;
 };
 
 public static boolean checkPassword(String checkPass){
	 if (checkPass.equals(password))
	 	{return true;
	 	}
	 else return false;
 }
 
 public String getUser(){
	 return userName;}
 
}

