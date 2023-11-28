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

	public EnumCurrency getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(EnumCurrency currencyType) {
		this.currencyType = currencyType;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}


	
	@Override
	public String toString() {
		return "CurrencyAccount [currencyType=" + currencyType + ", exchangeRate=" + exchangeRate + ", toString()="
				+ super.toString() + "]";
	}

	public double ConvertCurrency(double amt) {
		if (currencyType == EnumCurrency.USD) {
			return amt * 0.73;
		} else if (currencyType == EnumCurrency.EUR) {
			return amt * 0.67;
		} else {
			return amt;
		}
	}
	
}
