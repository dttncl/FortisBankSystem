package bus;

public class Transaction {
	private String transactionNumber;
	private EnumTransaction transactionType;
	private EnumAccount accountType;
	private Date transactionDate;
	private String description;
	private double amount;
	
	public Transaction() {
		super();
		this.transactionNumber = "T-000";
		this.transactionType = EnumTransaction.Undefined;
		this.accountType = EnumAccount.Undefined;
		this.transactionDate = new Date();
		this.description = "";
		this.amount = 0;
	}

	public Transaction(String transactionNumber, EnumTransaction transactionType, EnumAccount accountType,
			Date transactionDate, String description, double amount) {
		super();
		this.transactionNumber = transactionNumber;
		this.transactionType = transactionType;
		this.accountType = accountType;
		this.transactionDate = transactionDate;
		this.description = description;
		this.amount = amount;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public EnumTransaction getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(EnumTransaction transactionType) {
		this.transactionType = transactionType;
	}

	public EnumAccount getAccountType() {
		return accountType;
	}

	public void setAccountType(EnumAccount accountType) {
		this.accountType = accountType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionNumber=" + transactionNumber + ", transactionType=" + transactionType
				+ ", accountType=" + accountType + ", transactionDate=" + transactionDate + ", description="
				+ description + ", amount=" + amount + "]";
	}
	
	public void generateSummary() {
		 
	}
}
