package chapter06;

public class Sub {
	int s;
	void sub(){
		int x = 5;
		setDouble(x);
		System.out.print(x + " ");
		System.out.println(s);
	}
	void setDouble(int x)
	{
		x = x*2;
		s = x;
	}
}
//void sub(){
//int [] a1 = {3,4,5};
//int [] a2 = modify(a1);
//System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
//System.out.println(a2[0]+" "+a2[1]+" "+a2[2]);
//}
//int [] modify(int [] a3){
//a3[1] = 10;
//return a3;
//}
//void sub(){
//boolean b1 = false;
//set(b1);
//System.out.println(b1);
//}
//void set(boolean b1){
//b1 = true;
//}
//void sub(){
//	Point p = new Point();
//	p.x = 10;
//	p.y = 20;
//	set(p);
//	System.out.println(p.x+","+p.y);
//	}
//void set(Point p) {
//	p.x = 30;
//	p.y = 40;
//}