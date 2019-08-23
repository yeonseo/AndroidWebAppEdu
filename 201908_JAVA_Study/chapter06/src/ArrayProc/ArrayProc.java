package ArrayProc;

import java.util.Arrays;

public class ArrayProc {
	private int[] score;
	private int sum;
	private double aver;
	private int max;	
	private int min;	
	
	public ArrayProc() {
		this.aver=0.0;
		this.max=0;
		this.min=0;
		this.score=new int[10];
		this.sum=0;
	}
	public ArrayProc(int size) {
		this.aver=0.0;
		this.max=0;
		this.min=0;
		this.score=new int[size];
		this.sum=0;
	}
	public void getScore() {
		for(int i=0 ; i < score.length ; i++) {
			this.score[i] = (int) (Math.random()*(100-0)+1);
		}
	}
	public void getSum() {
		for(int i=0 ; i < score.length ; i++) {
			this.sum = this.sum + this.score[i];
		}
	}
	public double getAve() {
		this.aver=(double)this.sum/(double)this.score.length;
		return this.aver;
	}
	public void getMax() {
		this.max= this.score[0];
		for(int i=0 ; i < score.length ; i++) {
			if(this.max < this.score[i]) this.max = this.score[i];
		}
	}
	public void getMin() {
		this.min= this.score[0];
		for(int i=0 ; i < score.length ; i++) {
			if(this.min > this.score[i]) this.min = this.score[i];
		}
	}
	@Override
	public String toString() {
		return "ArrayProc [score=" + Arrays.toString(score) + ", sum=" + sum + ", aver=" + aver + ", max=" + max
				+ ", min=" + min + "]";
	}
	
}
