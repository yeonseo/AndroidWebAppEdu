package chapter07.car2;

public class CatTest {
	public static void main(String[] args) {
		Car firstCar = new Car("Good Car");
		Car secondCar = new Car("Very Good Car");
		if(firstCar.equals(secondCar)) System.out.println("Same Car");
		else System.out.println("Diff Car");
	}
}
