package chapter05.problem;

public class Dog {
	private int age; private String name; private String breed;
	public Dog() {
		this.age=0; 	this.name=null; this.breed=null;
	}
	
	public Dog(String name,int age) {
		this.age=age; this.name=name;
	}
	public Dog(String name,int age,  String breed) {
		this.age=age; this.name=name;	this.breed=breed;
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
		return "Dog [age=" + age + ", Color=" + name + ", breed=" + breed + "]";
	}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getColor() {return name;}
	public void setColor(String name) {name = name;}
	public String getBreed() {return breed;}
	public void setBreed(String breed) {this.breed = breed;}
}
