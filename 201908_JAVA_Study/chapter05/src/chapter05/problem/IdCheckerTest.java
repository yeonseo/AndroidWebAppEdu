package chapter05.problem;

public class IdCheckerTest {

//	public static void main(String[] args) {
//		IdChecker id = new IdChecker();
//		id.IdCheck("멍멍이");
//		id.IdCheck("냥냥이");
//		id.IdCheck("멍멍이");
//		
//		IdCheckerArrayList list = new IdCheckerArrayList();
//		list.IdCheck("멍멍이");
//		list.IdCheck("냐옹이");
//		list.IdCheck("냥냥이");
//		list.IdCheck("멍멍이");
//	}
	void sub() {
	int [] a1 = {3,4,5};
	int [] a2 = modify(a1);
	System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
	System.out.println(a2[0]+" "+a2[1]+" "+a2[2]);
	}
	int [] modify(int [] a3){
	        a3[1] = 10;
	        return a3;
	    }
	    public static void main(String [] args) 
	    {
	    Test p = new Test();
	        p.sub();
	    }
}
