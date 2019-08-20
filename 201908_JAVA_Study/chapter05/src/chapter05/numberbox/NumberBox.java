package chapter05.numberbox;

public class NumberBox {
	private int ivalue;
	private float fvalue;
	
	public NumberBox(int ivalue, float fvalue) {
		this.ivalue=ivalue;
		this.fvalue=fvalue;
	}
	
	public void printValue() {
		System.out.println("");
		System.out.println("ivalue : " + this.ivalue + "  fvalue : " + this.fvalue);
	}
	public float multiValue() {
		return this.ivalue*this.fvalue;
	}
	public int getIValue() {
		return this.ivalue;
	}
	public float getFValue() {
		return this.fvalue;
	}
	public void setIValue(int ivalue) {
		this.ivalue=ivalue;
	}
	public void setFValue(float fvalue) {
		this.fvalue=fvalue;
	}
}