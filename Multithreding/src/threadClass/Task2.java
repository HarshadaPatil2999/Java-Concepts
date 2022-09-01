package threadClass;

public class Task2 extends Thread {

	public Task2(String string) {
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Task2.currentThread().getName()+" "+i);//highest priority execute first
//		      try {
//				Thread.sleep(1000); //sleep method used to execute thread in puse.in millis or millis ,nanomillis.//highest priority 
//				                            execute first
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			Thread.yield();//allow to execute same priority to execute or lower priority execute first.
			
		}
	}
	public static void main(String[] args) {
		
		Task2 t2=new Task2("AB");
		Task2 t3=new Task2("CD");
		Task2 t4=new Task2("XY");
		t2.setName("A");
		t3.setName("B");
		t4.setName("C");
		t2.setPriority(5);
		t3.setPriority(8);
		t4.setPriority(3);
		t2.start();//first always first execute first .or according to priority also if we set priority.
//		try {
//			t2.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			t2.join();// first t2 thread is execute completely then other thread execute .
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t3.start();
//		try {
//			t3.sleep(1000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			t3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t4.start();
		
		
	}
}
