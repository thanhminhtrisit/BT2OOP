package pojo;

import method.BankingMethod;

public class SavingsAccount extends BankAccount implements BankingMethod {
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int accountNumber, double balance) {
		super.setAccountNumber(accountNumber);
		super.setBalance(balance);
	}

	@Override
	public void withDraw(double amount) {
		if (super.getBalance() < amount) {
			System.out.println("The balance is not enough to draw!");
		} else {
			double balance = super.getBalance();
			balance -= amount;
			super.setBalance(balance);
			System.out.println("Success to draw " + amount + " now your balance is " + super.getBalance());
		}

	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			double balance = super.getBalance();
			balance += amount;
			super.setBalance(balance);
			System.out.println("Success to deposit " + amount + " now your balance is " + super.getBalance());
		} else {
			System.out.println("Your amount is not suitable! (Amount need to be greater than 0)");
		}

	}

	@Override
	public void display() {
		System.out.println("Your account is: " + super.getAccountNumber() + " has " + super.getBalance());
	}
}
