package chapter07.studentgraduate;

public class StudentTest {

	public static void main(String[] args) {
		JnderGraduate jg = new JnderGraduate("yeonseo", "201416026", "phycis", 4, 36, "edu");
		switch (jg.type()) {
		case 1 : System.out.print("교육, "); break;
		case 2 : System.out.print("연구, "); break;
		}
		System.out.println("장학금 : "+jg.money());
		
		Graduate g = new Graduate("yeonseo", "201416026", "phycis", 4, 36, "playPlay!!");
		System.out.println(g.toString());
	}

}
