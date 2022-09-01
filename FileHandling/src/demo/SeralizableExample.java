package demo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeralizableExample {
	
	void storedData()
	{
		
		try {
			FileOutputStream fos = new FileOutputStream("D://StoredData.txt");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			Employee e1=new Employee(101,"Meena","HR",70000);
			os.writeObject(e1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
	
	void readObject()
	{
		try {
			FileInputStream fis=new FileInputStream("D://StoredData.txt");
			ObjectInputStream oi =new ObjectInputStream(fis);
			Employee e1=(Employee)oi.readObject();
			System.out.println(e1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void main(String[] args) {
	SeralizableExample s=new SeralizableExample();
	s.storedData();
	s.readObject();
}
}
