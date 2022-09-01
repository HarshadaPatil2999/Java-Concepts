package demo;

import java.io.File;
import java.io.IOException;

public class FileExample {
	void CreateNewFile()
	{
		File f=new File("D://Demo.txt");
		  boolean s=f.canExecute();
		  System.out.println(s);
		 
			try {
				f.createNewFile();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("created new file");
			
		
	}
	
	void read()
	{
		File fr=new File("D://Demo2.txt");
		File frs=new File("D://text323.txt");
		File f=new File("D://Demo.txt");
	Boolean s=fr.canRead();
	System.out.println(s);
	Boolean b=fr.canWrite();
	System.out.println(s);
	System.out.println(fr.compareTo(f));
     System.out.println(fr.exists());
     System.out.println(frs.delete());
    f.deleteOnExit();//delete current file which is the ref of the file is
  System.out.println( f.getName());
		
	}
	
	
	
	public static void main(String[] args) {
		FileExample fe=new FileExample();
		fe. CreateNewFile();
		fe.read();
	}

}
