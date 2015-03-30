package wibit;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Wibit5ReadSystemin {
	public static void main(String[] args)
	{
//		InputStreamReader instream = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(instream);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a line of text: ");
		try
		{
		String userInput = br.readLine();
		System.out.println("This is what you typed: ");
		System.out.printf(userInput);
		}
		catch (Exception e)
		{
			System.err.println("invalid input : " + e );
		}
		
		String filepath = args[0];
		File file = new File(filepath);
		if(file.exists())
			System.out.println("file name is: " + file.getName());
		else
			System.out.println("Cant find file");
		
		
	}

}


