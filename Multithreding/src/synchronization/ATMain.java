package synchronization;

public class ATMain {
	public static void main(String[] args) {
		
		ATM a =new ATM();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
		
	}

}
