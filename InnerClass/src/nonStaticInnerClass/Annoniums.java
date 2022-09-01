package nonStaticInnerClass;

abstract class  Person{
	
	abstract void display();
}


interface A {
	
	 void show();
}


class B{
	 
	int a=100;
	void showData()
	{
		System.out.println(a);
	}
	
}
public class Annoniums {
	
	public static void main(String[] args) {
		Person p=new Person()
		{  String name="abc";
			void display()
			{
				System.out.println("Abstrct class");
				System.out.println(name);
			}
			
	   };
	   
	   p.display();
	   
	 A a=new A()
	  {
		   public void show()
		  {
			  System.out.println("Interface ");
		  }
	     
	  };
	  a.show();
	   
	  
	  B b=new B()
			  {
		          void showData()
		          {
		        	  super.showData();
		        	System.out.println("class override method");
		        	
		          }
			  };
			  
		 b.showData();
		
		
	}
	
	

}
