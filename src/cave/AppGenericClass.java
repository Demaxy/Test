package cave;

import java.util.ArrayList;

public class AppGenericClass {

	public static void main(String[] args) {
	
//		before java 5
		
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("oranges");
		
		/*
		 * downcast object to the type u want (String)
		 */
		String fruit1 = (String)list.get(0);
		String fruit2 = (String)list.get(1);
		
		System.out.println(fruit1);
		System.out.println(fruit2);
		
		/*
		 * In java 5 generics were introduced so u can parameterized class 
		 * so methods can return object of the right type
		 */
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("cat");
		list2.add("dog");
		
		String animal = list2.get(0);
		String animal2 = list2.get(1);
		
		System.out.println(animal);
		System.out.println(animal2);

	}

}
