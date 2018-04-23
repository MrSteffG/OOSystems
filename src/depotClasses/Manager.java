package depotClasses;

import java.util.LinkedList;

public class Manager extends Driver{

	/**
	 * Constructs a manager consisting of a username, password and work schedule. Used to differentiate user type.
	 * @param userName the username used to identify the user.
	 * @param password the password used to verify the user.
	 * @param wsList the work schedule the user adheres to.
	 */
	public Manager(String userName, String password,LinkedList<WorkSchedule> wsList ) {
		super(userName, password, wsList);
	}
}
		

	

	

