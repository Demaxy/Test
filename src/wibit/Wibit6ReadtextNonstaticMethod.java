package wibit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wibit6ReadtextNonstaticMethod 
{
	
	public static void main (String[] args)
	{
		String textFile = args[0];
		String inputText = "";
		Wibit6ReadtextNonstaticMethod objectMainClass = new Wibit6ReadtextNonstaticMethod();
		inputText = objectMainClass.ReadText(textFile);
		{
		System.out.println(inputText);
		}
	}
	

	public String ReadText(String filepath)
	{
		String returnText ="";
		
		try 
		{
		FileReader objectfilepath = new FileReader(filepath);
		int b = objectfilepath.read();
		while (b >=0)
		{
			returnText += Character.toString((char)b);  
		}
		objectfilepath.close();
		
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.err.println(e.getMessage());
		}
		return returnText;
	}

}