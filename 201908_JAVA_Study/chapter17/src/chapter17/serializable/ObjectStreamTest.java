package chapter17.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("Object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		DataObject data = new DataObject(10,"민지 생축해!!");
		oos.writeObject(data);
		if(oos!=null) {
			oos.close();
		}
		System.out.println("Done!");
		
		FileInputStream fis=new FileInputStream(file);
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    DataObject student1=(DataObject)ois.readObject();
	    System.out.println(student1);
	}

}
