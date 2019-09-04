package chapter14.problem;

public class BankAccount {
	private int balance;
	public void deposit(int input) {
		this.balance += input;
	}
	public void withdraw(int output) throws NegativeBalanceException {
		if(this.balance<output) {
			throw (new NegativeBalanceException("잔액이 모자릅니다."));
		}
		this.balance -= output;
	}
}
