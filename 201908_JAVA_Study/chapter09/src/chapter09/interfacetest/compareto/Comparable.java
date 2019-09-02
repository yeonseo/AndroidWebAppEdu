package chapter09.interfacetest.compareto;

public interface Comparable {
	public default int comparaTo(Object object) {
		return 0;
	}
}
