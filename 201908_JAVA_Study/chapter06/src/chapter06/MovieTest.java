package chapter06;

public class MovieTest {

	public static void main(String[] args) {
		String[] actors = {"샤이아 라보프","메간 폭스","타이리스 깁슨"};
		Movie movie = new Movie("Transformer", "Michael Bay",actors);
		System.out.println(movie.toString());
		
	}

}
