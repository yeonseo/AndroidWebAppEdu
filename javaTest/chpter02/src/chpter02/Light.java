package chpter02;

public class Light {
	public static void main(String[] args) {
		//1. 변수 선언 lightSpeed, distance
		//2. lightSpeed 상수값 저장 300_000
		//3. distance = lightSpeed*(s)
		//4. distance = 
		
		long lightSpeed=0L;
		long distance=0L;
		lightSpeed = 300_000L;
		distance = lightSpeed*365*24*60*60;
		System.out.printf("빛이 1초에 이동하는 거리 : %dkm \n",distance);
		System.out.println("빛이 1초에 이동하는 거리 : " +distance+"km");
	}
}
