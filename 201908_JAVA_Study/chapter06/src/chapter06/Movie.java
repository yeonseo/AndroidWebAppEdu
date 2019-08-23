package chapter06;

import java.util.Arrays;

public class Movie {
	private String title; private String director; private String[] actors;
	
	public Movie(int actorsNum) {
		this.title=null; this.director=null; this.actors=new String[actorsNum];
	}
	public Movie(String movieName, String director, String[] actors) {
		this.title=movieName; this.director=director; this.actors=actors;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public String[] getActors() {
		return actors;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + 
				", actors=" + Arrays.toString(actors) + "]";
	}
}

//private String title; private String director; private String company;
//
//public Movie() {
//	this.title=null; this.director=null; this.company=null;
//}
//public Movie(String movieName, String director, String company) {
//	this.title=movieName; this.director=director; this.company=company;
//}