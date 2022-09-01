package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SeraliizableExampleUserInput {
	
	void writeData( ArrayList<Employee>list)
	{
		try {
//			FileOutputStream fos=new FileOutputStream("D://StoredData.txt",true);
			FileOutputStream fos=new FileOutputStream("D://StoredData.txt");
			ObjectOutputStream os =new ObjectOutputStream(fos);
//			Employee e1=new Employee(id,name,dept,salary);
			os.writeObject(list);
			System.out.println("object added");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void readData()
	{
		try {
			FileInputStream fis=new FileInputStream("D://StoredData.txt");
			ObjectInputStream ois =new ObjectInputStream(fis);
		     ArrayList<Employee>list=(ArrayList<Employee>) ois.readObject();
		     System.out.println(list);
			
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
		Scanner sc=new Scanner (System.in);
		
		ArrayList<Employee>list=new ArrayList<>();
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter id,name,dept,salary");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int salary=sc.nextInt();
			
			list.add(new Employee(id,name,dept,salary));
		}
		
		SeraliizableExampleUserInput se=new SeraliizableExampleUserInput();
		se.writeData(list);
		se.readData();
	}

}
