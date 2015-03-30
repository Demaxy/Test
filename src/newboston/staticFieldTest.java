package newboston;
//http://tutorials.jenkov.com/java/fields.html
//static fields

// public class staticFieldTest
//	{
//		 static String staticField1;
//		 
//	 public static void main(String[] args)
//		{
//		   
//		   staticFieldTest.staticField1 = "value";
//		   System.out.println(staticFieldTest.staticField1);
//		}
//		
//	}
///////////////////////////////////////////////////////////////////////////////////////////

//non-static fields
 
public class staticFieldTest
	{
	String myString1;
	String one = "Hello";
	String two = " World";
	String three = new StringBuilder(one).append(two).toString();
	String four  = new StringBuilder(one).append(two).toString();
	
	public static void main(String[] args)
	{
	staticFieldTest test = new staticFieldTest();
	test.myString1 = "Hello world";
	System.out.println(test.myString1);	   
	
	
	
		   
	}
}		
