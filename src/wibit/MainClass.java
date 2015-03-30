package wibit;

public class MainClass {

	public static void main(String[] args) {

		if(args.length == 0)
		{
			System.err.println("No arguments. Please try again.");
			return;
		}
		else if(args.length > 1)
		{
			System.err.println("Too many arguaments. Please try again");
			return;
		}
		String myString = new String(args[0]);
		
		System.out.println("String=" + myString);
		System.out.println("Length=" + myString.length());
		System.out.println("First half of string=" + myString.substring(0, myString.length() /2));
	//	System.out.println("Second half of string=" + myString.);
			
	}

}
