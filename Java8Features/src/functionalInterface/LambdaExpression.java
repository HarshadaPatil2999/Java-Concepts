package functionalInterface;

public class LambdaExpression 
{
	
	public static void main(String[] args) {
		
		// Addition a=()->System.out.println("In addition Method");
		   //a.add();
		//lambda expresion  is used with functional interface only and one abstact method in inteface.
		//lambda expression is used when we don't want to take implementation to interface.
		
//		Addition a=()->{
//			int b=30,c=14;
//			System.out.println("In addition method");
//			System.out.println("additon is:"+(b+c));
//			
//		};
//		 a.add();
		
//		Addition a=(t)->System.out.println("Squre is:"+(t*t));
//		a.Squre(6);
		
//		Addition a=(x,y)->System.out.println("Full Name:"+(x+" "+y));
//		a.FullName("Harshada", "Patil");
		
		Addition a=(x,y)->{
			char ch=x.charAt(0);
			System.out.println("Name:"+(y+" "+ch));
		};
		a.FullName("Harshada", "Patil");
	}

}
