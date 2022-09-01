package synchronization;

public class BankAccount {
	
	int balance=5000;
	
//	   public  synchronized void transfer(int amt) //for proper changes we use synchronized method or synchronized block.
//	   {
////		    System.out.println("balance is:"+balance);
//		  System.out.println("please wait...");
//		   balance=balance+amt;
//		   System.out.println(" new balance is:"+balance);
//	    	
//	    }
	
	
	public void transfer(int amt)
	{
		
//		synchronized(this)
//		{
////			System.out.println("balance is:"+balance);
//			 balance=balance+amt;
//			   System.out.println("new balance is:"+balance);
//			
//		}
		synchronized(ATM.class)
		{
		//System.out.println("Available balance is:"+balance);
			 balance=balance+amt;
			   System.out.println("new balance is:"+balance);
			
		}
		
	}

}
