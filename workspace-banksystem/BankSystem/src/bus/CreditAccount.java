package bus;

public class CreditAccount extends LineOfCreditAccount {
	
	private Double transactionFee;
	
	public CreditAccount() {
		super();
	}
	
	public CreditAccount(Double transactionFee) {
		super();
		this.transactionFee = transactionFee;
	}
	
	public double getTransactionFee() {
		return this.transactionFee;
	}
	
	public void setTransactionFee(Double transactionFee) {
		this.transactionFee = transactionFee;
	}
	
	@Override
	public String toString() {
		return "CreditAccount [freeTransactions="+transactionFee+"]";
	}

}
