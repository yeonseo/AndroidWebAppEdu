package chapter07.singleton;

class SingleTon {
	private int a = 10;
	private String string = "과제하자.....";
	//2.온통 아주 private로만 만드는구만... 로드될 때만 만들도록 자기객체를 가지고 있는 정적멤버변수 
	private static SingleTon single;
	
	//3.객체를 만든다. 블럭초기문을 이용해서 객채를 만드는 연습을 하도록 하자
	static{
		single = new SingleTon();
	}
	
	//1.생성자를 외부에서 접근하지 못하도록 한다.
	private SingleTon() { //한번만 만들고 접근을 하지 못하게 하겠다!
	}
	
	//4.이것을 사용하려면 클래스명으로도 접근하지 못한다. 그러면 사용하게 하려면?
	public static SingleTon gerSingleton() {
		if(single==null) single = new SingleTon();
		return single;
	}
	public void print() {
		System.out.println("와아... 과제할 시간이야.... 널 기다렸어...."+string);
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

}
