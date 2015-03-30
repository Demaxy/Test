package newboston;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

	public FileIO(String filename)
	{
		
		BufferedReader br;
		try
			{
				br = new  BufferedReader(new FileReader(filename));
				String line = "";
				while((line = br.readLine()) != null)
				{
					System.out.println("Reading line: " + line);
				}
			}
		catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		catch (IOException e)
			{
				e.printStackTrace();
			}
	}
}
