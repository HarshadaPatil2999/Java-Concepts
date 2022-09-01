package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	
	void readFile()
	{
		try {
			FileReader fr=new FileReader("D://test.txt");
			BufferedReader br= new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			
			fr.close();
			
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
			FileWriter fw =new FileWriter("D://test.txt",true);
			
			
		    fw.write(" ThinkQuotient");
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		 CharacterStream c=new  CharacterStream();
		 c.writeFile();
		 c.readFile();
	}

}
