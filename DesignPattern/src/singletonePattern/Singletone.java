package singletonePattern;

public class Singletone {
	
	//static Singletone obj=new Singletone ();//early Instantiation.//1st create once static object and pass to other 
	                                            //  the changes is affected other object also.
	
	static Singletone obj=null;//lazy Instantiation.//create a object whenever we want .and the changes also affected on other object also.
	String str;
	
	private Singletone()
	{
		str="Core Java";
	}
	
	public static Singletone getInstance()
	{
		if(obj==null)
		obj=new Singletone();
		
		return obj;
	}
	public static void main(String[] args) {
		Singletone s1=new Singletone().getInstance();
		Singletone s2=new Singletone().getInstance();
		Singletone s3=new Singletone().getInstance();
//		s1.str=s1.str.toUpperCase();//if we make changes in one object they reflected atomatically on other object
//		System.out.println(s1.str);
//		System.out.println(s2.str);
//		System.out.println(s3.str);
	s2.str=s2.str.toLowerCase();//if we make changes in one object they reflected atomatically on other object.
	
	System.out.println(s1.str);
	System.out.println(s2.str);
	System.out.println(s3.str);
		
		
	}
	

}
