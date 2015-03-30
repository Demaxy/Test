package newboston;
public class tuna
{
		private int month;
		private int day;
		private int year;
		
		public tuna(int m, int d, int y)
		{
			month = m;
			day = d;
			year = y;
			
			System.out.printf("the constructor for this is %s\n ", this);	
		}		
		
		/*
		public void int setValue()
		{
			
		}*/
}







/*
public class tuna {

	private String name;
	private printString birthday;
	
	public tuna(String theName, printString theDate)
	{
		name = theName;
		birthday = theDate;
	}
	
	public String toString()
	{
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}

	// References to an object but u need a string 
	// any time i need a string from an object ...it can go to toString method in myclass and fetch it...
	
	
}
*/