package bus;

import java.util.ArrayList;

public class BankManager extends User {
	private ArrayList<Customer> listOfCUstomers;

	public BankManager() {
		super();
		this.listOfCUstomers = null;
	}

	public BankManager(String userId, String userPIN, String fName, String lName, ArrayList<Customer> listOfCUstomers) {
		super(userId, userPIN, fName, lName);
		this.listOfCUstomers = listOfCUstomers;
	}

	public ArrayList<Customer> getListOfCUstomers() {
		return listOfCUstomers;
	}

	public void setListOfCUstomers(ArrayList<Customer> listOfCUstomers) {
		this.listOfCUstomers = listOfCUstomers;
	}

	@Override
	public String toString() {
		return "BankManager [listOfCUstomers=" + listOfCUstomers + ", toString()=" + super.toString() + "]";
	}
	
}
