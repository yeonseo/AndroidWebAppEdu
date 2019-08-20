package chapter05.problem;

public class Dog {
	private int age; private String Color; private String breed;
	public Dog() {
		this.age=0; 	this.Color="White"; this.breed="Siba";
	}
	public Dog(int age, String Color, String breed) {
		this.age=age; this.Color=Color;	this.breed=breed;
	}
	public String barking(){
		return this.toString()+"멍멍! 멍멍멍!!!";
	}
	public String hungry(){
		return this.toString()+"배고파합니다 ㅠㅠ 밥주세";
	}
	public String sleeping() {
		return this.toString()+"졸립졸립... 자러갑니다....";
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", Color=" + Color + ", breed=" + breed + "]";
	}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getColor() {return Color;}
	public void setColor(String color) {Color = color;}
	public String getBreed() {return breed;}
	public void setBreed(String breed) {this.breed = breed;}
}
