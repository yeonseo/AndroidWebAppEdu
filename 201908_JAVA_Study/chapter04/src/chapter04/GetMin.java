package chapter04;

import java.util.Arrays;

public class GetMin {
	public static void main(String[] agrs) {
		final int INDEX = 10;
		//1.정수형 배열 객체를 만든다. (s) 10개를 선언한다.
		int[] s = new int[INDEX];
		inputIntArray(s);
		//3.첫번째 배열객체요소 값을 minimum값으로 저장한다.
		int minimum=s[0];
		//4. 모든배객체 요소를 차례대로 비교하여 값을 수정한다.
		for(int i=0; i<s.length ; i++) {
			if(minimum > s[i]) 	minimum=s[i];
		}
		System.out.println(Arrays.toString(s));
		System.out.println("최솟값 : " +minimum);
	}
	
	public static void inputIntArray(int[] s) {
		//2.랜덤으로 10-50까지 배열객체 저장한다.
				for (int i=0; i<s.length ; i++){
					s[i]=(int) (Math.random()*(50-10+1)+10);
				}
	}
	
}
