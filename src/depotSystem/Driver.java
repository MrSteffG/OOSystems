package depotSystem;


public class Driver {
protected String userName;
protected static  String password;


 public Driver(String userName, String password){
	 this.userName= userName;
	 this.password= password;  


 };
 
public static boolean checkPassword(String userName,String pass){
	if (pass==password){
		return true;
	}
	else return false;
}

 public String getUser(){
	 return userName;}
 
}

