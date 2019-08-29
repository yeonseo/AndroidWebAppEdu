package chapter07.phone;

public class SmartPhone extends Phone{
	private String os;
	private String version;
	private int size;
	private boolean camera;
	private boolean bluetooth;
	
	public SmartPhone(String company, int price, String type, String os
			, String version, int size, boolean camera, boolean bluetooth) {
		super(company, price, type);
		this.os=os; this.version=version; this.size=size;
		this.camera=camera; this.bluetooth=bluetooth;
	}

	public String getOs() {return os;}
	public void setOs(String os) {this.os = os;}
	public String getVersion() {return version;}
	public void setVersion(String version) {this.version = version;}
	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}
	public boolean isCamera() {return camera;}
	public void setCamera(boolean camera) {this.camera = camera;}
	public boolean isBluetooth() {return bluetooth;}
	public void setBluetooth(boolean bluetooth) {this.bluetooth = bluetooth;}

	@Override
	public String toString() {
		return "SmartPhone [os=" + os + ", version=" + version + ", size=" + size + ", camera=" + camera
				+ ", bluetooth=" + bluetooth + ", getCompany()=" + getCompany() + ", getPrice()=" + getPrice()
				+ ", getType()=" + getType() + "]";
	}
	
}
