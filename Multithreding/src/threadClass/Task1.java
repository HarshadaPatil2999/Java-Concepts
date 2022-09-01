package threadClass;

public class Task1 extends Thread
{
	
	public Task1(String string) {
		// TODO Auto-generated constructor stub
	}

	public void run()
	{
		System.out.println("Before start Thread Name:"+Task1.currentThread().getName());
		System.out.println("Before start t1 state:"+Task1.currentThread().getState());
		for(int i=1;i<=5;i++)
		{
			System.out.println(Task1.currentThread().getName()+" "+i);//highest priority execute first
		}
	}
	
	public static void main(String[] args) {
		
//		Task1 t1=new Task1(); //we can overload the constructor
//		Task1 t2=new Task1();
		Task1 t1= new Task1("A");
		Task1 t2=new Task1("B");
		t1.setName("ABA");
		t2.setName("CDC");
		System.out.println("t2 name:"+t2.currentThread().getName());
		System.out.println("t2 state:"+t2.currentThread().getState());
		System.out.println(t1.currentThread().getName());
		System.out.println(t1.isAlive());//before start false
		t1.setDaemon(true);
		t1.interrupt();
		t1.start();
		t2.start();
		
		System.out.println("After start Thread Name:"+t1.currentThread().getName());
		System.out.println("After start t1 state:"+t1.currentThread().getState());
		System.out.println("Ptiority t1:"+t1.getPriority());
		t1.setPriority(MAX_PRIORITY); //the priority is set 1 t0 10 and 1 is min priority ,10 is max priority,5 is default priority or normal
		t2.setPriority(2);
		System.out.println("After set t2 priority:"+t2.getPriority());
		System.out.println("after set priority:"+t1.getPriority());
		System.out.println(t1.isAlive());//after start true
		System.out.println(t1.interrupted()); //false
		System.out.println("after set true daemon:"+t1.isDaemon());
		System.out.println("After:"+t1.isInterrupted());//true
		System.out.println("t1 set last:"+t1.getState());//terminated
		
	}

}
