package entities;

public class Account {
	
	private String holder;
	private int accountNumber;
	private double balance;
	public double initialDeposit;
	public Account() {
		
	}
	
	public Account(String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber;
	}

	public Account(String holder, int accountNumber, double initialDeposit) {
		this.holder = holder;
		this.accountNumber = accountNumber;
		//Saldo começa com o depósito lido, se optar por realizar
		deposit(initialDeposit);
	}
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(double amount) {
	    if (amount > 0) {
	       this.balance = balance + amount;
	    }
	}
	
	public void withdraw(double amount) {
		if (amount > 0) {
			this.balance = (balance - amount) * 0.95;
		}
	}
	
	public String toString() {
	    return "Account " 
	        + accountNumber 
	        + ", Holder: " 
	        + holder 
	        + ", Balance: $ " 
	        + String.format("%.2f", balance);
	}
}
