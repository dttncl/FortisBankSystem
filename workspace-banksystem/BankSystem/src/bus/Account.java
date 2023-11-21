package bus;

public class Account {
	private String accountNumber;
	private EnumAccount type;
	private Date openedDate;
	private double availBalance;
	private double totalBalance;
	
	public Account() {
		super();
	}
	
	public Account(String accountNumber, EnumAccount type, Date openedDate, double availBalance, double totalBalance) {
		super();
		this.accountNumber = accountNumber;
		this.type = type;
		this.openedDate = openedDate;
		this.availBalance = availBalance;
		this.totalBalance = totalBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public EnumAccount getType() {
		return type;
	}
	
	public void setType(EnumAccount type) {
		this.type = type;
	}
	
	public Date getOpenedDate() {
		return openedDate;
	}
	
	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}
	
	public double getAvailBalance() {
		return availBalance;
	}
	
	public void setAvailBalance(double availBalance) {
		this.availBalance = availBalance;
	}
	
	public double getTotalBalance() {
		return totalBalance;
	}
	
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", type=" + type + ", openedDate=" + openedDate
				+ ", availBalance=" + availBalance + ", totalBalance=" + totalBalance + "]";
	}
	
}
