package chapter06.circle;

import java.util.Scanner;

public class ArrayProc {
	Scanner scan = new Scanner(System.in);
	private int[] score; //객체참조변수 생성자에서 초기화를 해야한다.
	private int sum;
	private double average;
		
	public ArrayProc(int arrSize, int sum, double average) {
		this.score=new int[arrSize];
		this.sum=sum;
		this.average=average;
	}
	public void getValues() {
		for(int i=0; i<score.length ; i++) {
			System.out.print("입력 : ");
			this.score[i]=scan.nextInt();
		}
	}
	public void getSum() {
		for(int i=0; i<score.length ; i++) {
			this.sum+=score[i];
		}
	}
	public void getAverage() {
		this.average=(double)sum/(double)score.length;
	}
	public String arrPrint() {
		return String.format("총합 : %3d , 평균 : %3f", this.sum,this.average);
	}
	
}
