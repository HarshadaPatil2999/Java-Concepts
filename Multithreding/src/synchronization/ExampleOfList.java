package synchronization;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfList extends Thread {
	
	static ArrayList<String>list;
	 ExampleOfList ()
	 {
	 list=new ArrayList<>(); //array list is not synchronized so throw concurrentmodification
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	 }
	
	public void run()
	{
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	list.add("E");
		
		
	}
	 
	
	public static void main(String[] args) {
		
		
		
		Thread t1=new ExampleOfList();
		  t1.start();
		
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{    
			
			System.out.println(itr.next());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
