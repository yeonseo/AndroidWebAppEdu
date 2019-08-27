package chapter07.dynamic;

public class DynamicCallTest {
	public static void main(String[] args) {
		Animal an = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj;
		obj = an;
		obj.sound();
		obj = dog;
		obj.sound();
		obj = cat;
		obj.sound();
		
	}
}
