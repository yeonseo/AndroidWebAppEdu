package chapter15.problem;

public class Stack <T> {
	private T[] stack;
	public void push(T[] stack) {this.stack = stack;}
	public T[] pop() {return stack;}

}
