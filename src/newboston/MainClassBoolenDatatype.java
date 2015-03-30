package newboston;

public class MainClassBoolenDatatype {

	public static void main(String[] args) {
		Boolean myBool = null;
		if(args[0].equals("TRUE")) myBool = new Boolean(Boolean.TRUE);
		else if(args[0].equals("FALSE")) myBool = new Boolean(Boolean.FALSE);
		else if(args[0].equals("true")) myBool = new Boolean(true);
		else if(args[0].equals("false")) myBool = new Boolean(false);
		else
		{
			System.err.println("Unknown input:" + args[0]);
			return;
		}
		
		System.out.println("myBool=" + myBool.toString());
	}

}












