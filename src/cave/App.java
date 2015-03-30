package cave;

import java.util.ArrayList;

class Machine 
{

	@Override
	public String toString() 
	{
		return "this is machine";
	}
	
	public void start()
	{
		System.out.println("start");
	}

}

class Camera extends Machine 
{

	@Override
	public String toString() 
	{
		return "this is camera";
	}

}

public class App {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());

		showList(list1);
	}

	public static void showList(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
			
		}

	}

}
