package bus;

public class LineOfCreditAccount extends Account {
	
	private Double currentBalance;
	private Double lateFee;
	
	public LineOfCreditAccount() {
		super();
	}
	
	public LineOfCreditAccount(Double currentBalance, Double lateFee) {
		super();
		this.currentBalance = currentBalance;
		this.lateFee = lateFee;
	}
	
	public double getCurrentBalance() {
		return this.currentBalance;
	}
	
	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	public double getLateFee() {
		return this.lateFee;
	}
	
	public void setLateFee(Double lateFee) {
		this.lateFee = lateFee;
	}

	@Override
	public String toString() {
		return "LineOfCreditAccount [currentBalance=" + currentBalance + ", lateFee=" + lateFee + ", toString()="
				+ super.toString() + "]";
	}
	

}
