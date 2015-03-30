package newboston;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileStreamObject 
	{
		
		public static void main(String[] args) 
			{
				{
					try 
					{
						InputStream f = new FileInputStream (new File("C:/Java/hello.txt"));
					} 
					catch (FileNotFoundException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 
				}
		
			}
	
	}
