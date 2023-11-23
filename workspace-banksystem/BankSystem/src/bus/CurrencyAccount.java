package bus;

public class CurrencyAccount extends Account {
	private EnumCurrency currencyType;
	private double exchangeRate;
	
	public CurrencyAccount() {
		super();
		this.currencyType = EnumCurrency.Undefined;
		this.exchangeRate = 0;
	}
	
	public CurrencyAccount(String accountNumber, EnumAccount type, Date openedDate, double availBalance,
			double totalBalance, EnumCurrency currencyType, double exchangeRate) {
		super(accountNumber, type, openedDate, availBalance, totalBalance);
		this.currencyType = currencyType;
		this.exchangeRate = exchangeRate;
	}
	
	
	
}
