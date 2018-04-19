package depotSystem;

public class Driver {
	protected String userName;
	protected String password;
	protected String startDate;
	protected String endDate;

	public Driver(String userName, String password) {
		this.userName = userName;
		this.password = password;

	};

	public boolean checkPassword(String pass) {
		if (pass.equals(password)) {
			return true;
		} else
			return false;
	}

	public String getUser() {
		return userName;
	}



	public boolean isAvailble() {
		
		
		
		return false;
	}

}
