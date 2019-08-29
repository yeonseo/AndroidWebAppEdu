package chapter07.singleton.test;

public class SingleTon {
	private static SingleTon singleton /* = new Singleton()*/;
	static {
		singleton = new SingleTon();
	}
	public static SingleTon getSingleTon() {
		if(singleton == null) {
			singleton = new SingleTon();
		}
		return singleton;
	}
}
