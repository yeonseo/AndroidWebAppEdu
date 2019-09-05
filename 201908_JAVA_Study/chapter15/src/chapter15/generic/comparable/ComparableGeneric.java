package chapter15.generic.comparable;

public class ComparableGeneric<T extends ComparableGeneric> implements Comparable<T> {
	private int no;
	private String name;
	
	public ComparableGeneric(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(/*ComparableGeneric = */T t) {
		ComparableGeneric cg = null;
		if(t instanceof ComparableGeneric) {
			cg = (ComparableGeneric) t;
		}
		if(this.no < cg.no) {
			return 1;
		}
		if(this.no > cg.no) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "ComparableGeneric [no=" + no + ", name=" + name + "]";
	}

}
