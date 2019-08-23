package chapter06.nestedclass;

public class Outer {
	//1. 멤버변수 인스턴스변수
	private int age;
	private static int sage;
	private String name;
	private int birthday;
	//2. 멤버내부클래스 (정적내장클래스,비정적내장클래스)
	static class StaticClass{
		//멤버 변수 함수 생성
		public StaticClass() {
			//age = 20; //인스턴스 변수를 사용할 수 없다.
			sage=20;
			//InnerClass inner = new InnerClass(); //로드가 되지 않았기 때문에 사용x
			StaticClass2 static2 = new StaticClass2();
		}
		public void staticMyMethod() {
			sage=30;
		}
	}
	
	static class StaticClass2 {
		
	}
	class InnerClass{
		//멤버 변수 함수 생성
		public InnerClass() {
			sage=10;
			StaticClass staticClass = new StaticClass();
			InnerClassB innerB = new InnerClassB();
		}
		public void innerMyMethod() {
			age=20; sage=30;
			System.out.println("InnerClass"+sage);
		}
	}
	class InnerClassB{
		
	}
	public Outer() {
		
	}
	
	public Outer(int age) {	
		
	}
	
}
