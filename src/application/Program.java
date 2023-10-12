package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		
		Scanner sc = new Scanner(System.in); 
		
		Account acc = new Account(1001, "Ana", 1000.0);
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		Account acc2 = new SavingsAccount(1002, "Bia", 1000, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		Account acc3 = new BusinessAccount(1003, "Bobby", 1000.0, 500.0);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
		
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		/*
		 * // UPCASTING
		 * 
		 * Account acc1 = bacc; Account acc4 = new BusinessAccount(1003, "Bobby", 0.0,
		 * 200.0);
		 * 
		 * // DOWNCAST
		 * 
		 * BusinessAccount acc5 = (BusinessAccount) acc2; acc5.loan(100.0);
		 * 
		 * // BusinessAccount acc5 = (BusinessAccount)acc3; savings account to business
		 * // account conversion is no accepted
		 * 
		 * if (acc3 instanceof BusinessAccount) { BusinessAccount acc6 =
		 * (BusinessAccount) acc3; acc6.loan(200.0); System.out.println("Loan!"); }
		 * 
		 * if (acc3 instanceof SavingsAccount) { SavingsAccount acc5 = (SavingsAccount)
		 * acc3; acc5.updateBalance(); System.out.println("Update!"); }
		 */
		Account account;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		 		
		
		sc.close();

	}

}
