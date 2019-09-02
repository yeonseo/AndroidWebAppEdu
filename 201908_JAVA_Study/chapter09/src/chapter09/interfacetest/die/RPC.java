package chapter09.interfacetest.die;

import java.util.Scanner;

public class RPC {
private int getValue;
	
	public RPC() {
		this.getValue=0;
	}
	public void setValue(int getValue) {
		this.getValue=getValue;
	}
	public int getValue() {
		return this.getValue;
	}
	public void rollRPC() {
		this.getValue=(int) (Math.random()*(3-1+1)+1);
		Scanner scan = new Scanner(System.in);
		System.out.print("1-3 사이의 숫자를 입력 : ");
		int userValue = scan.nextInt();
		if(userValue-getValue==1||userValue-getValue==-2) System.out.println("졌습니다.");
		if(userValue-getValue==0) System.out.println("비겼습니다.");
		if(userValue-getValue==-1||userValue-getValue==2) System.out.println("이겼습니다...");
	}
}
