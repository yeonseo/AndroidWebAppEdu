package chapter05.test;

public class Telelvision {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public Telelvision(){
		this.channel=0;
		this.volume=0;
		this.onOff=false;
	}
	public void setChannel(int channel) {
		this.channel=channel;
	}
	public void setVolume(int volume) {
		this.volume=volume;
	}
	public void setOnOff(boolean onOff) {
		this.onOff=onOff;
	}
	public int getChannel() {
		return channel=channel;
	}
	public int getVolume() {
		return volume=volume;
	}
	public boolean getOnOff() {
		return onOff=onOff;
	}
}
