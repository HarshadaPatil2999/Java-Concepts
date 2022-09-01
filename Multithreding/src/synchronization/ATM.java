package synchronization;

public class ATM  implements Runnable{
	
	BankAccount obj=new BankAccount();
			public void run()
			{
				
				obj.transfer(20000);
				System.out.println("Done!");
		
			}

}
