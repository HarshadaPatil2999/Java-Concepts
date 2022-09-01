package writtenTest;

import java.util.Arrays;

public class Task1  extends Thread{
	
	
	public void run()
	{
		
		String[]a= {"abc","cde","xyz","lmn","pqr"};
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+a[i]);
		}
		
	}
	public static void main(String[] args) {
//		
//		Task1 t=new Task1();
//		Thread t1= new Task1();//thread 0
//		Thread t2= new Task1();//thread 1
		Task1 t=new Task1();
		Thread t1=new Thread(t);//thread 1
		Thread t2=new Thread(t);//thread 2
		
//	t1.setName("AB");
//		t2.setName("CD");
//		t1.setPriority(15);//shows an IllegalArgumentException
		
		t1.start();
		t2.start();
//		t1.setName("XY");
//		t2.setName("PQ");
		
		
		
	}

}
