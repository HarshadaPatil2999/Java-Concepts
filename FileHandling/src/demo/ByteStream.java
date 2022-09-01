package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	
	void fileRead()
	{
		try {
			FileInputStream fis=new FileInputStream("D://test.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	void writeFile()
	{
		try {
			FileOutputStream fos=new FileOutputStream("D://test.txt",true);
			String s="ThinkQuotient";
			for(int i=0;i<s.length();i++)
			{
				int b=s.charAt(i);
				System.out.print( (char)b);
			}
			
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ByteStream b=new ByteStream();
		
		b.writeFile();
		b.fileRead();
	}

}
