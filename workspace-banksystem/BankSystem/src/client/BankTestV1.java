package client;
import java.util.Scanner;

import bus.*;

public class BankTestV1 {

	public static void main(String[] args) {

		String userId, userPin;
		int transac, acc, amt;
		
		Scanner in = new Scanner(System.in);
		
		BankManager Atwater = new BankManager();
		Customer Sharon = new Customer();
		Customer Bonnie = new Customer();
		
		
		System.out.println("Welcome to Fortis Bank");
		System.out.print("Enter User Id: ");
		userId = in.next();
		System.out.print("Enter PIN: ");
		userPin = in.next();
		
		// loop thru the list of customers
		// if found,
		System.out.println("\n\n+++++++++ Enter Transaction +++++++++");
		System.out.println("[1] Withdraw\n[2] Deposit\n[3] Check Account Balance\n[0] Cancel");
		transac = in.nextInt();
		
		System.out.println("\n\n+++++++++ Enter Account +++++++++");
		System.out.println("[1] Checking Account\n[2] Savings Account\n[3] Currency Account");
		System.out.println("[4] line Of Credit Account\n[5] Credit Account\n[0] Cancel");
		acc = in.nextInt();
		
		System.out.println("\n\nEnter Amount (must be multiple of 5): $");
		amt = in.nextInt();
		
		switch(acc) {
		
		// Checking
		case 1:
			
			switch(transac) {
			// Withdraw
			case 1:
				break;
			// Deposit
			case 2:
				break;
			// Check Balance
			case 3:
				break;
			// Cancel
			case 0:
				break;
			
			default:
				System.out.println("Invalid Transaction");
				break;
			}
			
			break;
			
		// Savings
		case 2:
			break;
			
		// Currency
		case 3:
			break;
			
		// Line Of Credit
		case 4:
			break;
			
		// Credit
		case 5:
			break;
		
		// Cancel
		case 0:
			break;
			
		default:
			System.out.println("Invalid Account");
			break;
		}
		
		
		
	}

}
