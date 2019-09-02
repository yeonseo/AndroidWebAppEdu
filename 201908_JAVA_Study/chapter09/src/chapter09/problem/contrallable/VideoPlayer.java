package chapter09.problem.contrallable;

public class VideoPlayer implements Controllable{

	@Override
	public void play() {
		System.out.println("System : play");
	}

	@Override
	public void stop() {
		System.out.println("System : stop");
	}

}
