package nonStaticInnerClass;

public class LocalMethod {
	int a=200;
	private int b=300;
	static int c=500;
	
	void display()
	{
		class Inner
		{  
			static int b=140;
			void show()
			{ 
				 final  int b=30; //static variable is not allowed inside a method  so make it final
				
				System.out.println(a+" "+LocalMethod.this.b+" "+c);
				System.out.println(b+" "+this.b);
			}
			
			
		}
		Inner i =new Inner();
		i.show();
		
	}
	public static void main(String[] args) {
		LocalMethod lm=new LocalMethod();
		lm.display();
	}

}
