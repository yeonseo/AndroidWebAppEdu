package chpter02;

public class Hello {

	public static void main(String[] args) {
		String name = "������";
		String address = "����Ư���� ���Ǳ�";
		String college = "�����а�";
		String phoneNumber = "010-9991-9092";
		
		System.out.println("�̸� : " +name );
		System.out.println("�ּ� : "+ address);
		System.out.println("�а� : "+college);
		System.out.println("��ȭ��ȣ : "+phoneNumber);
		
		int z=5;
		
		for(int i=0 ; i<z*2 ; i++) {
			if(i<z) {
				for(int j=0 ; j < z-i ; j++ ) {
					System.out.print(" ");
				}
				for(int j=0 ; j < 2*i-1 ; j++ ) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0 ; j < i-z ; j++ ) {
					System.out.print(" ");
				}
				for(int j=0 ; j < (z*2-i)*2-1 ; j++ ) {
					System.out.print("*");
				}
			}
		 System.out.println("");
		}
	}
}