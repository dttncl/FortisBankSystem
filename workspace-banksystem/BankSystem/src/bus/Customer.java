package bus;

import java.util.ArrayList;

public class Customer extends User {
	
	private ArrayList<Account> listOfAccounts;
	private ArrayList<Transaction> listOfTransactions;
	
	public Customer() {
		super();
		this.listOfAccounts = null;
		this.listOfTransactions = null;
	}
	
	public Customer(ArrayList<Account> listOfAccounts, ArrayList<Transaction> listOfTransactions) {
		super();
		this.listOfAccounts = listOfAccounts;
		this.listOfTransactions = listOfTransactions;
	}

	public ArrayList<Account> getListOfAccounts() {
		return listOfAccounts;
	}

	public void setListOfAccounts(ArrayList<Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}

	public ArrayList<Transaction> getListOfTransactions() {
		return listOfTransactions;
	}

	public void setListOfTransactions(ArrayList<Transaction> listOfTransactions) {
		this.listOfTransactions = listOfTransactions;
	}

	@Override
	public String toString() {
		return "Customer [listOfAccounts=" + listOfAccounts + ", listOfTransactions=" + listOfTransactions
				+ ", toString()=" + super.toString() + "]";
	}


	public void addTransaction(Transaction oneTransaction) {
		listOfTransactions.add(oneTransaction);
	}
	
	public void addAccount(Account oneAccount) {
		listOfAccounts.add(oneAccount);
	}
	
	public void removeAccount(Account oneAccount) {
		listOfAccounts.remove(oneAccount);
	}
	
}
