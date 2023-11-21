package bus;

public class SavingsAccount extends Account {
	private double interestRate;
	private double annualGain;
	
	public SavingsAccount(double interestRate, double annualGain) {
		super();
		this.interestRate = interestRate;
		this.annualGain = annualGain;
	}

	public SavingsAccount(String accountNumber, EnumAccount type, Date openedDate, double availBalance,
			double totalBalance, double interestRate, double annualGain) {
		super(accountNumber, type, openedDate, availBalance, totalBalance);
		this.interestRate = interestRate;
		this.annualGain = annualGain;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAnnualGain() {
		return annualGain;
	}

	public void setAnnualGain(double annualGain) {
		this.annualGain = annualGain;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", annualGain=" + annualGain + "]";
	}
	
}
