package chapter05.box2;

public class NumberBox {
	private  int iValue; private float fValue;
	private double dValue; private char cValue;
	
	public NumberBox() {
		this.iValue = 0; this.fValue = 0.0f; this.dValue = 0.0; this.cValue = 65;	
	}
	public NumberBox(int iValue, float fValue,
			double dValue) {
		this.iValue = iValue; this.fValue = fValue;
		this.dValue = dValue; this.cValue = 65;
	}
	public NumberBox(int iValue, float fValue,
			double dValue, char cValue) {
		this.iValue = iValue; this.fValue = fValue;
		this.dValue = dValue; this.cValue = cValue;
	}
	public float calculator(int iValue, float fValue) {
		this.iValue+=iValue; this.fValue+=fValue;
		return this.iValue*this.fValue;
	}
	public double calculator(int iValue, double dValue) {
		this.iValue+=iValue; this.dValue+=dValue;
		return this.iValue+this.dValue;
	}
	@Override //컴파일러에게 이게 오버라이딩했으니까 니가 확인해야해! 라고 알려주는 어노테이션!!
	public String toString() {
		return "NumberBox [iValue=" + iValue + ", fValue=" + 
				fValue + ", dValue=" + dValue + ", cValue=" + cValue + "]";
	}
}
