package chapter07.shape;

public class ColoredRectangle extends Rectangle{

	String color;
	
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super(x,y,width,height);
		System.out.println("ColoredRectangle");
		this.color = color;
	}

	public static void main(String[] args) {
		ColoredRectangle obj = new ColoredRectangle(10,10,20,20,"read");
	}

}
