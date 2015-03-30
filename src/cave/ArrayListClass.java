package cave;

import java.util.ArrayList;

public class ArrayListClass {
	
		public static void main (String [] args)
		{
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("one");
			list.add("two");
			showList(list);
		
		}
		
		public static void showList(ArrayList<String> list)
		{
			for(String value:list)
			{
				System.out.println(value);
			}
		}

}
