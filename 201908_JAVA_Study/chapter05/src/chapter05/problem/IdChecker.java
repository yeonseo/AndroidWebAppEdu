package chapter05.problem;

public class IdChecker {
	private static int idStore;
	private String[] user = new String[4];

	
	public IdChecker() {
		this.user[0] = "냐옹이";
		this.user[1] = "고양이";
		this.user[2] = "냥냥이";
		this.user[3] = "나비";
		idStore=4;
	}
	public void IdCheck(String userName) {
		int count =0;
		for(int i = 0 ; i < this.user.length ; i++) {
			if(userName == user[i]) {
				System.out.println(userName+"님 반갑습니다 :-)");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(userName+"님 등록되지 않은 아이디입니다. 새로 등록합니다.");
			idStore++;
			this.user[this.user.length-1] = userName;
			System.out.println(userName+"님 반갑습니다 :-)");
		}
		
	}
}
