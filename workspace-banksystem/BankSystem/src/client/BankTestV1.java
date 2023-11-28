package client;
import bus.*;

public class BankTestV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac1 = new Account("123 456 789",EnumAccount.CheckingAccount, new Date(12,27,1983), 12000.00, 15000.00);
		CheckingAccount ca1 = new CheckingAccount(4,8,12.50);
		LineOfCreditAccount lca1 = new LineOfCreditAccount(10000.00,120.0);
		CreditAccount cda1 = new CreditAccount(14.23);
		
		System.out.println(ac1);
		System.out.println(ca1);
		System.out.println(lca1);
		System.out.println(cda1);

	}

}
