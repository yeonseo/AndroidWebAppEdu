package chapter07.interfacetest.compareto;

public class Rectangle implements Comparable{
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		this.width=width; 
		this.height=height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	public int getArea() {
		return this.width*this.height;
	}
	
	public int comparaTo(Object other) {
		Rectangle otherArea;
		int returnValue=0;
		if(other instanceof Rectangle) {
			otherArea = (Rectangle)other;
			if(this.getArea() == otherArea.getArea()) {
				System.out.println("same");
				returnValue= 0;
			}
			else if (this.getArea() < otherArea.getArea()) {
				System.out.println("small");
				returnValue= -1;
			}
			else {
				System.out.println("big");
				returnValue= 1;
			}
		}
		else {
			System.out.println("네가 아니야..... Rectangle.... ");
			System.exit(0);
		}
		return returnValue;
	}
	
}
