package chapter04;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] agrs) {
		//1.상수를 정의 한다. 
		int total=0;
		final int COUNT = 10;
		//2. 1차원 정수형배열 클래스를객체화 한다. 생성자 값은 COUNT
		int[] score = new int[COUNT];
		//3.반복문을 언한다. 배열길이만큼 반복한다.
		for(int i = 0; i<score.length; i++) {
			//3-1. 랜덤처리한다.
			score[i]=(int) (Math.random()*(100-50+1)+50);
			//3-2. 배열원소에 있는 값을 누적한다.
			total += score[i];
		}
		
		  System.out.println(Arrays.toString(score)+"총합계 = "+total+" 평균 = "+(int)(total/score.length));
	}
}
