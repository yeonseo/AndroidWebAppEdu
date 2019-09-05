package chapter15.problem.generic;

public class Stack <T> {
	private T[] stack;
	public void push(T[] stack) {this.stack = stack;}
	public T[] pop() {return stack;}

}
