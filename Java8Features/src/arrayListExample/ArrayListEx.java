package arrayListExample;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListEx {
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(200);
		al.add(500);
		al.add(800);
		al.add(1500);
		al.add(1000);
		al.add(100);
		al.add(24);
//		
//	      Consumer<Integer>print=(t)->System.out.println(t);//lamda expressions
//	      
//			al.forEach(print);
		
		 Consumer<Integer>print=(t)->
		 {
			 if(t>500)
			 System.out.println(t);
		 
		 };
		 al.forEach(print);
	      
			
			
		
		
		
	}

}
