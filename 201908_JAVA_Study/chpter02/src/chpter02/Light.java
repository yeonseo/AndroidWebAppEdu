package chpter02;

public class Light {
	public static void main(String[] args) {
		//1. ���� ���� lightSpeed, distance
		//2. lightSpeed ����� ���� 300_000
		//3. distance = lightSpeed*(s)
		//4. distance = 
		
		long lightSpeed=0L;
		long distance=0L;
		lightSpeed = 300_000L;
		distance = lightSpeed*365*24*60*60;
		System.out.printf("���� 1�ʿ� �̵��ϴ� �Ÿ� : %dkm \n",distance);
		System.out.println("���� 1�ʿ� �̵��ϴ� �Ÿ� : " +distance+"km");
	}
}