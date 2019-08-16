
public class ForEach {

	private int[] numbers;

	public ForEach() {
		this.numbers = new int[] {10,20,30};
	}
	
	public ForEach(int[] numbers) {
		this.numbers = new int[] {10,20,30};
	}
	public void printForMember(int[] numbers) {
		for(int i=0 ; i<numbers.length ; i++) {
			System.out.print(" \t"+ numbers[i]);
		}
	}
	public void printForEachMember(int[] numbers) {
		for(  int number : numbers) {
			System.out.print(" \t"+ number);
		} 
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
}
