package controller.view_control.test2;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;
	public Phone(String smartPhone, String image) {
		super();
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}
	public SimpleStringProperty getSmartPhone() {
		return smartPhone;
	}
	public void setSmartPhone(SimpleStringProperty smartPhone) {
		this.smartPhone = smartPhone;
	}
	public SimpleStringProperty getImage() {
		return image;
	}
	public void setImage(SimpleStringProperty image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Phone [smartPhone=" + smartPhone + ", image=" + image + "]";
	}
	
	
	
	
	
}
