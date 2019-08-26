package chapter07.bank;

public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NomalBank b2 = new NomalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("BadBank Rate : "+b1.getInterestRate());
		System.out.println("NomalBank Rate : "+b2.getInterestRate());
		System.out.println("GoodBank Rate : "+b3.getInterestRate());
	}

}
