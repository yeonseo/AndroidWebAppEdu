package chapter09.interfacetest.compareto2;

public class Rectangle extends ComparaTo{
	public int width;
	public int height;
	public Rectangle(int width, int heigth) {
		this.width=width;
		this.height=heigth;
	}
	public int getArea() {
		return this.height*this.width;
	}
	public int compareTo(Object object) {
		int returnValue=0;
		if(object instanceof Rectangle) {
			if(this.getArea()>((Rectangle) object).getArea()) {
				returnValue=1;
				System.out.println("큽니다.");
			}
			if(this.getArea()==((Rectangle) object).getArea()) {
				returnValue=0;
				System.out.println("같습니다.");
			}
			if(this.getArea()<((Rectangle) object).getArea()) {
				returnValue=-1;
				System.out.println("작습니다.");
			}
		}
		return returnValue;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
