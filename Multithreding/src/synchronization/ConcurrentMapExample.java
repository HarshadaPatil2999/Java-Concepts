package synchronization;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample extends Thread {
	static ConcurrentHashMap<Integer,String>cm;
	{
		
		cm=new ConcurrentHashMap<>();//it is synchronized map so not shown concurrentmodification exception
		cm.put(1, "A");
		cm.put(2, "B");
		cm.put(3, "C");
		 
	}
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cm.put(4, "D");
	}
	public static void main(String[] args) {
		
		Thread t1=new ConcurrentMapExample();
		t1.start();
		
		Iterator itr=cm.entrySet().iterator();
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
