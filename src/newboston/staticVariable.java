package newboston;

public class staticVariable {
	private String first;
	private String last;
// static means every object share the same variable ...so when it changes it changes with all object.
	
	private static int members = 0;
	
	public staticVariable(String fn, String ln)
	{
		first = fn;
		last = ln;
		members++;
		
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
		
	}
	
// 47 more on static 
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public static int getMembers()
	{
		return members;
	}
	

}
