package nonStaticInnerClass;

public class SimpleOrMember {
	
	static int a=100;
	int b=200;
  private int c=300;
	int e=100;
	
	class Inner
	  {
		static int d=400;
		int e=300;
		void display()
		{
			final int d=50;// static variable is not allowed inside a non static method so we give final 
			 int f=45;
			System.out.println(a+" "+b+" "+c);
			System.out.println(d+" "+e+" "+this.d);
			System.out.println(SimpleOrMember.this.e+" "+f);
			
		}
		
	}
	public static void main(String[] args) {
		SimpleOrMember sm=new SimpleOrMember();
		SimpleOrMember.Inner in1=sm.new Inner();
	//or
	SimpleOrMember.Inner in=new SimpleOrMember().new Inner();
	in.display();
	}

}
