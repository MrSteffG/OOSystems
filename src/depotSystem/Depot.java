package depotSystem;


public class Depot {
	private String depotName;
	private Driver[] arrayDriver;
	private Vehicle[] arrayVehicle;
	private Driver selected;
	

	
	public Depot(String depotName, Driver[] arrayDriver, Vehicle[] arrayVehicle) {
		this.depotName=depotName;
		this.arrayDriver=arrayDriver;
		this.arrayVehicle=arrayVehicle;

	}

	public Driver logOn(String userName, String password){
	selected=getDriver(userName);
		
		if (selected.checkPassword(password)){
			System.out.println("worked");	
			return selected;
			}
		else
			System.out.print("Not recognised please try again");
		return null;
	}


	public Vehicle getVehicle(String regNo) {
		for (Vehicle currentVehicle : arrayVehicle) {
			if (currentVehicle.getRegNo() == regNo) {
				return currentVehicle;
			}
		}
		return null;
	}

	public Driver getDriver(String userName) {//this bit works
		for (Driver currentDriver : arrayDriver) {
			if (currentDriver.getUser().equals(userName)) {
				return currentDriver;
			}
		}
		return null;
	}
	
	public static WorkSchedule setupWorkSchedule() {
		
		
		return null;
	}
	
	public static WorkSchedule WorkScheduleTest() {
		
		String ID = "001";
		String client = "Markyboi";
		String startDate = "1st May 2018";
		String endDate = "3rd May 2018";
		String regNo = "CS1455";
		String driver = "Milo";
		
		WorkSchedule WS = new WorkSchedule(ID, client, startDate, endDate, regNo, driver);
		return WS;
	}

	public String getDepotName() {
		return depotName;
	}

	public static void driverMenu(){
		
	}	
		
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public static Depot buildLiv() {
	
		Vehicle[] liverpoolVehicle = new Vehicle[4];
		Driver[] liverpoolDriver = new Driver[3];

		String name = "liverpool";
		liverpoolDriver[0] = new Driver("Steve", "donkeys");
		liverpoolDriver[1] = new Driver("Pete", "cows1");
		liverpoolDriver[2] = new Driver("Dan", "mongoose2");

		liverpoolVehicle[0] = new Vehicle("CS1457", "DAYCAB", "WHALEBODY");
		liverpoolVehicle[1] = new Vehicle("CS1458", "VOLVO", "FM7290");
		liverpoolVehicle[2] = new Vehicle("CS1451", "Merce;des-Benz", "Actros");
		liverpoolVehicle[3] = new Vehicle("CS1452", "Iveco", "PowerStar420E5");
		Depot liverpool = new Depot(name, liverpoolDriver, liverpoolVehicle);
		return liverpool;
	}

	public static Depot buildMan() {
		
		Vehicle[] manchesterVehicle = new Vehicle[4];
		Driver[] manchesterDriver = new Driver[4];
		String name = "manchester";
		manchesterDriver[0] = new Driver("Jeremy", "ilovesting");
		manchesterDriver[1] = new Driver("sally", "trucks4life");
		manchesterDriver[2] = new Driver("ruairi", "iloveanime");
		manchesterDriver[3] = new Driver("mark", "not93");

		manchesterVehicle[0] = new Vehicle("CS1459", "Tankerman", "Tankomatic5000");
		manchesterVehicle[1] = new Vehicle("CS1460", "Tankerman", "Tankotron4");
		manchesterVehicle[2] = new Vehicle("CS1453", "Tata", "Prima");
		manchesterVehicle[3] = new Vehicle("CS1454", "Foton", "Auman");
		Depot manchester = new Depot(name, manchesterDriver, manchesterVehicle);
		return manchester;
	}

	public static Depot buildBirm() {
		Vehicle[] birminghamVehicle = new Vehicle[4];
		Driver[] birminghamDriver = new Driver[4];
		String name = "birmingham";
		birminghamDriver[0] = new Driver("milo", "madeitwith");
		birminghamDriver[1] = new Driver("rao", "morrocco123");
		birminghamDriver[2] = new Driver("Hilary", "emailpass");
		birminghamDriver[3] = new Driver("thedon", "nogunlaw");

		birminghamVehicle[0] = new Vehicle("CS1461", "Tankerman", "Wetdrive");
		birminghamVehicle[1] = new Vehicle("CS1576", "Tankerman", "moistroller");
		birminghamVehicle[2] = new Vehicle("CS1455", "Hyundai", "Xcient");
		birminghamVehicle[3] = new Vehicle("CS1456", "Volvo", "VN780");
		Depot birmingham = new Depot(name, birminghamDriver, birminghamVehicle);
		return birmingham;

	}

}*/
