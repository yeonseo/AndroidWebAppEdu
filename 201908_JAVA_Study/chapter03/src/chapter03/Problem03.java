package chapter03;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		pro23();
	}
	
	public static void pro03() {
		int x=3;
		if (x >= 0) {
			if (x == 0) System.out.println("첫 번째 문자열");
			else System.out.println("두 번째 문자열");
		} else System.out.println("세 번째 문자열");
	}
	public static void pro04_1() {
		int age = 22;
		if( age > 20 ) {
			System.out.println("1번 그룹\n");
		}
		else {
			System.out.println("2번 그룹\n");
		}
		System.out.println("입니다.\n");
	}
	public static void pro04_2() {
		int age = 66;
		if( age > 20 ) {
			if( age < 65 )
				System.out.println("1번 그룹");
			else 
				System.out.println("2번 그룹");
		}
	}
	public static void pro06_1() {
		int i = 0;
		while(i < 10)
		{
			System.out.println("i="+i);
			i += 3;
		}
	}
	public static void pro06_2() {
		int x, y;
		for(x = 0;x < 3; x++)
			for(y = 2;y >= 0; y--)
				System.out.println("*");
	}
	public static void pro06_3() {
		int i = 0, sum = 0;
		while(i < 10 )
		{
			sum += i++;
			if( i % 3 == 0 ) continue;
			System.out.println("i="+i);
			if( sum > 10 ) break;
		}
	}
	public static void pro07_1() {
		int result=0;
		for(int i=1 ; i<=30;i++) {
			result=result+i*i+1;
		}
		System.out.println("결과 : "+result);
	}
	public static void pro07_2() {
		int result=0;
		for(int i=10 ; i<=30;i++) {
			for(int j=0; j<=5 ; j++) {
				result=result+i*j;		
			}
		}
		System.out.println("결과 : "+result);
	}
	public static void pro08() {
		int x=3;
		if (x >= 0) {
			if (x == 0) 	System.out.println("first");
			else	System.out.println("second");
		}
		System.out.println("third");
	}
	public static void pro09() {
		int result=0;
		for(int i=1 ; i<=100;i++) {
			if(i%3==0||i%4==0) result=result;
			else result=result+i;
		}
		System.out.println("결과 : "+result);
	}
	public static void pro10() {
		int userNum=0;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		userNum=input.nextInt();
		switch(userNum) {
		case 1: System.out.println("ONE"); break;
		case 2: System.out.println("TWO"); break;
		case 3: System.out.println("THREE"); break;
		case 4: System.out.println("FOUR"); break;
		case 5: System.out.println("FIVE"); break;
		case 6: System.out.println("SIX"); break;
		case 7: System.out.println("SEVEN"); break;
		case 8: System.out.println("EIGHT"); break;
		case 9: System.out.println("NINE"); break;
		default: System.out.println("OTHER"); break;
		}
	}
	public static void pro11() {
		int result=0;
		for(int i=1 ; i<=100;i++) {
			for(int j=0;j<=i;j++) {
				result=result+j;
			}
		}
		System.out.println("결과 : "+result);
	}
	public static void pro12() {
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하시오 : ");
		int numOne=input.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		int numTwo=input.nextInt();
		System.out.print("세 번째 정수를 입력하시오 : ");
		int numThree=input.nextInt();
		
		int first=0;
		int second=0;
		int third=0;
		if(numOne>numTwo) first=numOne;
		else first=numTwo;
			
		if(first>numThree) {
			second=(numTwo>numThree)?(numTwo):(numThree);
			third=(numTwo<numThree)?(numTwo):(numThree);
		}
		else {
			first=numThree;
			second=(numOne>numTwo)?(numOne):(numTwo);
			third=(numOne<numTwo)?(numOne):(numTwo);
		}
		System.out.println("입력값 : "+numOne+"  "+numTwo+"  "+numThree);
		System.out.println("결과 : "+first+"  "+second+"  "+third);
	}
	public static void pro13() {
		for(int i=1 ; i<6 ; i++) {
			for(int j=5 ; j >=1 ; j--)
				if(i+j==6) {
					System.out.println("("+i+","+j+")");
					break;
				}
		}
	}
	public static void pro14() {
		System.out.print("알파벳을 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		String string = input.next();
		char charValue = string.charAt(0);
		System.out.println(charValue);
		switch (charValue) {
		case 'a' : case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case'U': System.out.println("모음입니다.");
		default : System.out.println("자음입니다.");
		}
	}
	public static void pro15() {
		Scanner input = new Scanner(System.in);
		System.out.print("몸무게를 입력하시오 : ");
		double weight = input.nextDouble();
		System.out.print("키를 입력하시오 : ");
		double height = input.nextDouble();
		
		double standard  =  (height-100)*0.9;
		
		if(weight>standard) System.out.println("과체중입니다.");
		System.out.println("정상체중입니다.");
	}
	public static void pro16() {
		for(int i=0 ; i<=10 ; i++) {
			for(int j=0 ; j <=10 ; j++)
				if(i*3+10*j==100) {
					System.out.println("("+i+","+j+")");
					break;
				}
		}
	}
	public static void pro17() {
		for(int i=0 ; i<=10 ; i++) {
			for(int j=0 ; j <=10 ; j++) {
				for(int z=0;z<=10;z++) {
					if(i+j+z==10) {
						System.out.print("("+i+","+j+","+z+")");
						break;
					}
				}
			}System.out.println();
		}
	}
	public static void pro18() {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : (ex: 1 3 4) ");
		int  num1= input.nextInt();
		int  num2= input.nextInt();
		int  num3= input.nextInt();
		int min=0;
		
		if(num1<num2) min=num1;
		else if (num1>num2) min=num2;
		
		if(min>num3) min=num3;
		
		 System.out.println("최소값 : "+min);
	}
	public static void pro19() {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 :  ");
		int  num= input.nextInt();
		int result=0;
		if(num<=0) result=num*num*num-9*num+2;
		else result=7*num+2;
		 System.out.println("결과값 : "+result);
	}
	public static void pro20() {
		int count=0;
		for (int i=2 ; i<=100 ; i++) {
			for(int j=2 ; j <=i ; j++) {
				if (i%j==0) count++;
			}
			if(count == 1) System.out.print(i+" ");
			count=0;
		}
	}
	public static void pro21() {
		int line=0;
		for(int i=0 ; i<=100 ; i++) {
			for(int j=0 ; j <=100 ; j++) {
				for(int z=0;z<=100;z++) {
					if(i*i+j*j-z*z==0) {
						System.out.printf("(%3d,%3d,%3d)  ",i,j,z);
						line++;
						if (line==9) {
							System.out.println();
							line=0;
						}
						break;
					}
				}
			}
		}
	}
	public static void pro22() {
		for(int i=1 ; i<=10 ; i++) {
			for(int j=1 ; j <=10 ; j++) {
				System.out.printf("%4d ",i*j);
			}System.out.println(" ");
		} 
	}
	public static void pro23() {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개를 입력하시오 (ex 5 4) : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		char calcul;
		do {
			System.out.print("사칙연산 중에서 하나를 입력하세요 (+ - * /) : ");
			String calculator = input.next();
			calcul = calculator.charAt(0);
		}while(calcul!='+'&&calcul!='-'&&calcul!='*'&&calcul!='/');
		
		if(calcul=='+') {
			System.out.println("연산결과 : "+(num1+num2));
		}else if(calcul=='-') {
			System.out.println("연산결과 : "+(num1-num2));
		}else if(calcul=='*') {
			System.out.println("연산결과 : "+(num1*num2));
		}else if(calcul=='/') {
			if(num1!=0&&num2!=0)	System.out.println("연산결과 : "+(num1/num2));
			else if(num1!=0)System.out.println("0을 나눌 수 없습니다.");
			else if(num1!=0)System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	public static void pro24() {
		long a=0, b=1, c=0;
		Scanner input = new Scanner(System.in);
		int userNum=0;
		
		do {
			System.out.print("정수를 입력하시오 : ");
			userNum= input.nextInt();
		}while(userNum<0||userNum>100);
		
		for(int i=2 ; i<=userNum ; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}
	public static void pro25() {
		double result=0;
		for(int i=1 ; i<=100 ; i++) {
			result=result+1/(double)i;
		} System.out.println(result);
	}
}
