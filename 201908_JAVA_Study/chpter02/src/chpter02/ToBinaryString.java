package chpter02;

public class ToBinaryString {
	public static void main(String[] args) {
		int number;
		for(int i=0; i<10; i++) {
			number=(int) (Math.random()*(200-100+1)+100);
			toBinaryString(number);
		}
	}
	
	public static void toBinaryString(int num) {
		String strValue = Integer.toBinaryString(num);
		while(strValue.length()<32) {
			strValue="0"+strValue;
		}
		System.out.println(num+"  ÀÌÁø¼ö : "+strValue);
	}
}
