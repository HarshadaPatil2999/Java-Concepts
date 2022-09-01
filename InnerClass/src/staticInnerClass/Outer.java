package staticInnerClass;

public class Outer {
	static int a=100;
	int b=1000;
	
	void show()
	{
		System.out.println("outer class method display");
	}
	static class Inner// it only access static variable or methods 
//	                            from outer class and if we want non static  variable then create object of outer class 
//	                            
	{
		static int a=300;//shadowing of variable
		 static int c=100;
		void display()
		{
			
			System.out.println("Inner class display method:"+a);
			
			System.out.println(Inner.c);
			System.out.println(Outer.a);
			// for non static variable and method
			
			Outer o=new Outer();
			System.out.println(o.b);
			o.show();
			
		}
		
	}
	public static void main(String[] args) {
		Outer.Inner obj= new Outer.Inner();// always gives a ref of outer class for create a object of Inner class
		obj.display();
		
	}
	

}
