package chapter14.problem;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount userAccount = new BankAccount();
		userAccount.deposit(10000);
		try {
			userAccount.withdraw(15000);
		} catch (NegativeBalanceException e) { //e.printStackTrace();
		}
	}
}
