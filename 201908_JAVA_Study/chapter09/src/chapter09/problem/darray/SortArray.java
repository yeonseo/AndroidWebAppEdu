package chapter09.problem.darray;

import java.util.Arrays;

public class SortArray {
	private double[] dArray;
	public int[] sortArray(int[] iArray) {
		Arrays.sort(iArray);
		int[] arr = null;
		int j=0;
		for(int i : iArray) {
			arr[j++]=i;
		}
		return arr;
	}
	public double[] sortArray(double[] dArray) {
		Arrays.sort(dArray);
		double[] arr = null;
		int j=0;
		for(double i : dArray) {
			arr[j++]=i;
		}
		return arr;
	}
	public char[] sortArray(char[] cArray) {
		Arrays.sort(cArray);
		char[] arr = null;
		int j=0;
		for(char i : cArray) {
			arr[j++]=i;
		}
		return arr;
	}
}
