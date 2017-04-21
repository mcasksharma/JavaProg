package Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class mainClass {

	public static void main(String[] args) throws IOException {
		System.out.println("Start....");
		A obj = new A();
		obj.name="Sandeep";
		
		File f = new File("myfile.txt");
		FileOutputStream fos =new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);
		fos.close();
		
		FileInputStream ff = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(ff);
		try {
			A a1 = (A) ois.readObject();
			System.out.println("name = "+a1.name);
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class A implements Serializable{
	String name;
}