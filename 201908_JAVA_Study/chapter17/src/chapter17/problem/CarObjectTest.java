package chapter17.problem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import chapter17.serializable.DataObject;

public class CarObjectTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("Object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Car car = new Car("렌드로바","쨍한 빨강");
		oos.writeObject(car);
		if(oos!=null) {
			oos.close();
		}
		System.out.println("Done!");
		
		FileInputStream fis=new FileInputStream(file);
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    Car car1=(Car)ois.readObject();
	    System.out.println(car1);
	}
}
