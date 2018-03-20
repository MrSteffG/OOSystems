package depotSystem;

public class Driver {
 private String userName;
 private String password;


 public Driver(String userName, String password, String jobState){
	 this.userName= userName;
	 this.password= password;  
 };
 
 public boolean checkPassword(String checkPass){
	 if (checkPass.equals(password))
	 	{return true;
	 	}
	 else return false;
 }
 
 public String getUser(){
	 return userName;}
 
}

