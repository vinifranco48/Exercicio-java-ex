package Application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.BusinessException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String houlder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, houlder, balance, withdrawLimit);
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			
			acc.withdrawLimit(amount);
			System.out.printf("New balance: %.2f", acc.getBalance());
		}
		
		catch(BusinessException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
		

	}

}
