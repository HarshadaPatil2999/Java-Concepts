package runnableInterface;

public class Task1 implements Runnable
    
{
	public void run()
	{   
		for(int i=1;i<=5;i++)
		{   
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Task1 obj=new Task1();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		System.out.println(t1.getName());//thread 0
		System.out.println(t1.getState());//new
		System.out.println(t1.currentThread().getName());//main
		System.out.println(t1.getPriority());
		
		t1.start();
		
		System.out.println(t1.getState());//runnable
		System.out.println();
		t2.start();
		
	 
	   
	
	}

}
