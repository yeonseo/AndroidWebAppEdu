package chapter05.test1;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를호출
		//출력
		Car car = new Car(10,1,"Red");
		System.out.println("차색 : "+car.getColor()+" 기어 : "+car.getGear()+" 스피드 : "+car.getSpeed());
		
		car.setGear(2);
		car.setSpeed(30);
		car.setColor("Blue");
		System.out.println("차색 : "+car.getColor()+" 기어 : "+car.getGear()+" 스피드 : "+car.getSpeed());
		
		car.changeGear(1);
		car.downSpeed();
		car.downSpeed();
		System.out.println("차색 : "+car.getColor()+" 기어 : "+car.getGear()+" 스피드 : "+car.getSpeed());
	}

}
