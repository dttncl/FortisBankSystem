package bus;

public class CheckingAccount extends Account {
	
	private int freeTransactions;
	private int nbTransactions;
	private double transactionFee;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int freeTransactions, int nbTransactions, double transactionFee) {
		
		super();
		this.freeTransactions = freeTransactions;
		this.nbTransactions = nbTransactions;
		this.transactionFee = transactionFee;
	}
	
	public int getFreeTransactions() {
		return freeTransactions;
	}
	
	public void setFreeTransactions(int freeTransactions) {
		this.freeTransactions = freeTransactions;
	}
	
	public int getNbTransactions() {
		return nbTransactions;
	}
	
	public void setNbTransactions(int nbTransactions) {
		this.nbTransactions = nbTransactions;
	}
	
	public double getTransactionFee() {
		return transactionFee;
	}
	
	public void setTransactionFee(int transactionFee) {
		this.transactionFee = transactionFee;
	}
	
	@Override
	public String toString() {
		return super.toString() + "CheckingAccount [freeTransactions="+freeTransactions+", nbTramsactions="+nbTransactions+
				", transactionFee="+transactionFee+"]";
	}

}
