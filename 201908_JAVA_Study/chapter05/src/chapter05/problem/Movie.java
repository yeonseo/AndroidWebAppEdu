package chapter05.problem;

public class Movie {
	private String movieName; private double star;
	private String director; private int year;
	
	public Movie() {
		this.movieName=null; this.star=0; this.director=null; this.year=0;
	}
	public Movie(String movieName, double star, String director, int year) {
		this.movieName=movieName; this.star=star; this.director=director; this.year=year;
	}
	public void setMovie(String movieName, double star, String director, int year) {
		this.movieName=movieName; this.star=star; this.director=director; this.year=year;
	}
	public void print() {
		System.out.println("영화 제목 : "+this.movieName+", 평점 : "+this.star+
				", 감독 : "+ this.director+", 발표된 연도 : "+this.year);
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", star=" + star +
				", director=" + director + ", year=" + year + "]";
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getStar() {
		return star;
	}
	public void setStar(double star) {
		this.star = star;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
