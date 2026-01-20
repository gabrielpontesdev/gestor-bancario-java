package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine(); // Limpeza de buffer (importante!)
		
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().toLowerCase().charAt(0);
		
		if (response == 'y') {
		    System.out.print("Enter initial deposit value: ");
		    double initialDeposit = sc.nextDouble();
		    // Aqui você usa o seu Construtor com Sobrecarga (3 parâmetros)
		    account = new Account(holder, accountNumber, initialDeposit);
			}	
		else {
		    // Aqui você usa o Construtor sem o depósito
			account = new Account(holder, accountNumber);
		}

		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
