package pojo;

import method.BankingMethod;

public class CheckingAccount extends BankAccount implements BankingMethod {
	public CheckingAccount() {
		super();
	}

	public CheckingAccount(int accountNumber, double balance) {
		super.setAccountNumber(accountNumber);
		super.setBalance(balance);
	}

	@Override
	public void withDraw(double amount) {
		double balance = super.getBalance();
		balance -= amount;
		super.setBalance(balance);
		System.out.println("Success to draw " + amount + " now your balance is " + super.getBalance());
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
