package chapter05.problem;

public class CountCharater {
	private int consonant;
	private int vowel;
	private static char[] consonantArray =new char[] {'e','y','u','i','o','a'};
	
	public CountCharater() {
		this.consonant=0;
		this.vowel=0;
	}
	public void CountClear() {
		this.consonant=0;
		this.vowel=0;
	}
	public void CountingCharater(String source) {
		for(int i=0 ; i < source.length() ; i++) {
			for(int j=0 ; j < consonantArray.length ; j++) {
				if(source.charAt(i)==consonantArray[j]) {
					this.vowel++;
					this.consonant--;
				}
			}
			consonant++;
		}
		System.out.println(vowel+" "+consonant);
		CountClear();
	}
}
