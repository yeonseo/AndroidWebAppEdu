package chapter05.problem;

public class DogTest {

	public static void main(String[] args) {
		Dog dog = new Dog("힌둥",1,"시바");
		System.out.println(dog.toString());
		System.out.println(dog.barking());
		System.out.println(dog.hungry());
		System.out.println(dog.sleeping());
	}

}
