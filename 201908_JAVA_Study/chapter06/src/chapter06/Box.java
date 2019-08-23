package chapter06;

public class Box {
	private int x; 	private int y;
	private int z;  private String empty;
	
	public Box() {
		x=0; y=0;
		z=0; empty=null;
	}
	public Box(int x, int y, int z, String empty) {
		this.x=x; this.y=y;
		this.z=z; this.empty=empty;
	}
}
