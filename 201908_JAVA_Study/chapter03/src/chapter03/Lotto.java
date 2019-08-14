package chapter03;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		int n=0;
		int k=0;
		long fact1=1L, fact2=1L;
		n=inputNum(1,45);
		k=inputNum(1,6);
		for(int i=1 ; i<=k ; i++) {
			fact1=fact1*(n-i+1);
			fact2=fact2*i;
		}
		System.out.println(fact1+" "+fact2+" "+fact1/fact2);
	}

	public static int randNum() {
		int rand=0;
		rand = (int) (Math.random()*(100-1+1)+1);
		return rand;
	}
	public static int inputNum(int i, int j) {
		Scanner input = new Scanner(System.in);
		int result=0;
		do {
			result=input.nextInt();
		}while(result<i||result>j);
		return result;
	}
}
