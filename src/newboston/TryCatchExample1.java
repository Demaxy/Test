package newboston;
import java.io.*;
class TryCatchExample1
{
  public static void main(String[] args)
  {
    try
    {
      FileReader fr = new FileReader("try.txt");
      //int b = fr.read();
      String str = Integer.toString(fr.read());
      //String strI = Integer.toString(b);
      {
        System.out.printf(str);
        //b = fr.read();
      }
      fr.close();
    }
    catch (Exception ex)
    {
      System.err.println(ex.getMessage());
    }
  }
}