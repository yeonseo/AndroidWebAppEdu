package chapter05.problem;

import java.util.ArrayList;

public class IdCheckerArrayList {
	private static int idStore;
	private ArrayList<String> id = new ArrayList<>();

	
	public IdCheckerArrayList() {
		id.add("냥냥이");
		id.add("냐옹이");
		//how to construct
	}
	public void IdCheck(String userName) {
		int count =0;
		for(int i = 0 ; i < id.size() ; i++) {
			if(userName == id.get(i)) {
				System.out.println(userName+"님 반갑습니다 :-)");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(userName+"님 등록되지 않은 아이디입니다. 새로 등록합니다.");
			id.add(userName);
			System.out.println(userName+"님 등록되었습니다. :-)");
		}
		
	}
}
