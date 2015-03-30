package newboston;
/*public class simpleTest2 
{

	public static void main(String[] args) 
	{
		new FileIO("C:\\afile.txt");

	}

}
*/


/*import java.util.*;

public class simpleTest2 {

   public static void main(String args[]) 
   {
      try {
         long start = System.currentTimeMillis( );
         System.out.println(new Date( ) + "\n");
         Thread.sleep(5*60*10);
         System.out.println(new Date( ) + "\n");
         long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);
      } 
      catch (Exception e) 
      {
         System.out.println("Got an exception!");
      }
   }
}*/


//CommandLine --- passing command-line arguments to main( )   'METHODS'  http://www.tutorialspoint.com/java/java_methods.htm
/*public class simpleTest2 {

   public static void main(String args[]){ 
      for(int i=0; i<args.length; i++){
         System.out.println("args[" + i + "]: " + args[i]);
      }
   }
}*/





//ReadConsole --- http://www.tutorialspoint.com/java/java_files_io.htm

/*import java.io.*;

public class simpleTest2 {
   public static void main(String args[]) throws IOException
   {
      InputStreamReader cin = null;

      try 
      {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         	} while(c != 'q');
      }
      finally 
      {
         if (cin != null) 
	         {
	            cin.close();
	         }
      }
   }
}*/


// byte stream ....
/*
 
import java.io.*;

public class simpleTest2 {
   public static void main(String args[]) throws IOException
   {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}

*/



// character stream ... copy file 

/*import java.io.*;

public class simpleTest2 {
   public static void main(String args[]) throws IOException
   {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}

*/





import java.io.*;

public class simpleTest2
	{
		public static void main(String args[])
			{
				try 
				{
					InputStream f = new FileInputStream ("C:/Java/hello2.txt");
				} 
				catch (FileNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			/*{
					try
					{
						File f = new File("C:/java/hello");
						InputStream d = new File (FileInputStream());
					}
					catch (FileNotFoundException e) 
					{
						e.printStackTrace();
					}
				}*/
				
		 
	}

/*
import java.io.*;

public class simpleTest2{
   public static void main(String args[])throws IOException{

      DataInputStream d = new DataInputStream(new FileInputStream("test.txt"));

      DataOutputStream out = new DataOutputStream(new  FileOutputStream("test1.txt"));

      String count;
      while((count = d.readLine()) != null){
          String u = count.toUpperCase();
          System.out.println(u);
          out.writeBytes(u + "  ,");
      }
      d.close();
      out.close();
   }
}*/