package wibit;

public class MainWibit 
{

	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("no arguments. pls try again");
			return;
		}
		else if (args.length > 1)
		{
			System.out.println("too many arguments. pls try again");
			return;
		}
		String myString = new String(args[0]);
		System.out.println("String=" + myString);
		System.out.println("First half of string=" + myString.substring(0, myString.length() /2));
		System.out.println("Second half of string=" + myString.substring(myString.length()/2));

	}

}
