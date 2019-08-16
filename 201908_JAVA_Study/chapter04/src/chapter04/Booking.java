package chapter04;

import java.util.Scanner;

public class Booking {
	//1. member value(static member value, instance member value)
	private static Scanner input = new Scanner(System.in);
	
	private static final int COUNT = 10;
	private static int[] arrSeats= new int[COUNT];
	private static int[] arr= new int[COUNT];
	
	private  int selectNum=0;
	
	//생성자 함수
	public Booking() {
		for(int i=0 ; i < arrSeats.length ; i++) {
			arrSeats[i]=i+1;
			arr[i]=0;
		}
	}//end of seatInitialSystem
	
	
	public void Book() {
		bookingSystem();
	}
	
	public void bookingSystem() {
		do {
			seatPrintSystem();
			seatSelectSystem();
			
			if(selectNum==-1) {
				System.out.println("예매 시스템을 종료합니다.");
				System.exit(0); //break;
			}
			if(arr[selectNum-1]==0) {
				System.out.println("선택하신 좌석이 예매되었습니다.");
				arr[selectNum-1]++;
			}else System.out.println("선택하신 좌석은 선택불가합니다.");
		}while(true);
	}//end of bookingSystem
	
	public void seatSelectSystem() {
		do {
			System.out.print("예매하실 좌석을 선택하세요 :  ");
			selectNum=input.nextInt();
		}while(selectNum<-1||selectNum>10);
	}//end of seatSelectSystem
	
	public void seatPrintSystem() {
		System.out.println("--------------------------");
		for(int i=0 ; i < arr.length ; i++) {
			System.out.print(arrSeats[i] + "  ");
		}		
		System.out.println("\n--------------------------");
		for(int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "  ");
		}		
		System.out.println("\n--------------------------");
	}//end of seatPrintSystem

//source-generator... main에서 get어쩌고로 하
	public static int[] getArrSeats() {
		return arrSeats;
	}


	public static void setArrSeats(int[] arrSeats) {
		Booking.arrSeats = arrSeats;
	}


	public int getSelectNum() {
		return selectNum;
	}


	public void setSelectNum(int selectNum) {
		this.selectNum = selectNum;
	}
}
