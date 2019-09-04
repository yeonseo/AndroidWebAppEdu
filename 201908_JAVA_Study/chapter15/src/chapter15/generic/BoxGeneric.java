package chapter15.generic;

public class BoxGeneric<T, U> {
	private T t;
	private U u;
	public BoxGeneric(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public U getU() {
		return u;
	}
	public void setU(U u) {
		this.u = u;
	}
	public static <T> T getLast(T[] t) {
		// TODO Auto-generated method stub
		return t[t.length - 1];
	}
	public static <T> void swap(T[] obj, int i, int j) {
		T temp =  null;
		temp = obj[i];
		obj[i] = obj[j];
		obj[j] = temp;
	}
	public static <T> void print(T[] obj) {
		for(T i : obj) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
