package chapter04;

public class Problem20 {
	public static void pro20() {
		System.out.print("학생수를 입력하세요 : ");
		int studentNum=MainProblem04.input.nextInt();
		int[] arr = new int[studentNum];
		
		grade(arr);
		double result = average(arr);
		System.out.println(result);
	}
	public static void grade(int[] arr) {
		for (int i=0 ; i < arr.length ; i++) {
			do {
				System.out.print("학생"+(i+1)+"의 성적을 입력하세요 : ");
				arr[i]=MainProblem04.input.nextInt();
				if(arr[i]<0||arr[i]>100) System.out.println("잘못입력하셨습니다.");
			}while(arr[i]<0||arr[i]>100);
		}
	}
	public static double average(int[] arr) {
		double result = 0.0; 
		for(int i=0 ; i < arr.length ; i++) {
			result=result+(double)arr[i];
		}
		return result/(double)arr.length;
	}
}
