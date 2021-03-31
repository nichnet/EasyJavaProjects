

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 *
 */
public class Bank {

	/**
	 * The entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		//creates new instance of bank class
		Bank bank = new Bank();
		//calls the run method in the bank class instance.
		bank.run();

	}
	
	/**
	 * Runs the program by initializing and managing, bank accounts and customers.
	 */
	public void run() {
		System.out.println("Welcome to the bank, what is your name?");
		
		//create scanner so we can get user input
		Scanner scan = new Scanner(System.in);
		//get the next token/word
		String name = scan.next();

		System.out.println("Hello " + name + "! We are creating checking and savings accounts for you.");
		
		//Create the customer
		Customer customer = new Customer(name);

		System.out.println("What is your address?");
		
		//get address
		String address = scan.next();
		
		customer.setAddress(address);

		
		System.out.println("Customer details: " + customer);
		
		//create bank account
		BankAccount checkingAccount = new BankAccount("checking", customer);
		BankAccount savingsAccount = new BankAccount("savings", customer);

		//show info about the customer's accounts
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());

		System.out.println("Checkings account: ");
		System.out.println(checkingAccount.getAccountInfo());
		
		System.out.println("Savings account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits
		
		//checking
		System.out.println();

		System.out.println("Amount (decimal) to deposit into your checking account?");
		double amount = scan.nextDouble();
		checkingAccount.deposit(amount);
		
		//savings
		System.out.println();

		System.out.println("Amount (decimal) to deposit into your savings account?");
		amount = scan.nextDouble();
		savingsAccount.deposit(amount);
		
		//print balances
		System.out.println(checkingAccount.getAccountInfo());		
		System.out.println(savingsAccount.getAccountInfo());
		
		//withdrawals
		System.out.println();

		System.out.println("Amount (decimal) to withdraw from your checking account?");
		amount = scan.nextDouble();
		
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();

		System.out.println("Amount (decimal) to withdraw from your savings account?");
		amount = scan.nextDouble();
		
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		//print balances
		System.out.println(checkingAccount.getAccountInfo());		
		System.out.println(savingsAccount.getAccountInfo());
		
		//make sure to close the scanner at the end!
		scan.close();
	}
}
