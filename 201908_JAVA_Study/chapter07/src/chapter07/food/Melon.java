package chapter07.food;

public class Melon extends Food{
	private String name;
	public Melon(int calorie, int price, int weight, String name) {
		super(calorie, price, weight);
		this.name=name;
	}
	public void print() {
		System.out.println("calorie : "+super.getCalorie()+" price : "
	+this.getPrice()+" weight : "+this.getWeight()+" name : "+this.name);
	}
}

