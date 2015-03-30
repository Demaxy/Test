package wibit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.IOException;

public class MyClass 
{
	
	public static void main(String[] args) 
	{
		
		//FileReader reads a character from a text file. Each byte read is a single character.
		
		try 
			{
			
			FileReader fr = new FileReader("C:/try.txt");
			int rd = fr.read();
			while (rd >= 0)
				{
					System.out.println(rd);
					rd = fr.read();
				}
			fr.close();		
			}
		catch (FileNotFoundException e) 
			{
				System.err.println(e.getMessage());
			}
		catch (IOException ex)
		{
			System.err.println("IOException: " + ex.getMessage());
		}	
		
		//BufferedReader: To read a single lines of text ...use BufferedReader		
		try
			{
			
			FileReader fr2 = new FileReader("C:/try2.txt");
			BufferedReader textReader = new BufferedReader(fr2);
			String name = textReader.readLine();
			System.out.println(name);
			textReader.close();
			}
		catch (Exception e) 
			{
				System.err.println("Error2: "  + e.getMessage());
			}				
	}

}
