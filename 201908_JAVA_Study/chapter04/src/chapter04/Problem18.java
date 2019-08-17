package chapter04;

public class Problem18 {
	private static String[] arr1 = new String[] {"Clubs","Diamonds","Hearts","Spades"};
	private static String[] arr2 = new String[] {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

	public static void pro18()	{
		randomCard(arr1,arr2);
	}
	public static void randomCard(String[] arr1, String[] arr2) {
		String arr1Random = arr1[(int) (Math.random()*(4-1)+1)];
		String arr2Random = arr2[(int) (Math.random()*(14-1)+1)];
		
		System.out.println(arr1Random+"의 "+arr2Random);
	}
}
