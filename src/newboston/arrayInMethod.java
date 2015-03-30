package newboston;
//32
	/*
	public class arrayInMethod
		
		{
		
			public static void main(String[] args) 
			{
				int numberArray[] = {3,4,5,6,7};
				change(numberArray);
				
				for(int y:numberArray)
					System.out.println(y);
			}
		
			
			public static void change(int x[])
			{
				for(int counter=0;counter < x.length; counter++)
					x[counter]+=5;
			}
		}
	
	*/


//34 - Table for multi arrays

	/*
		public class arrayInMethod 
			{
				public static void main(String[] args) 
				
				{
					int firstArray[][]={{1,2,3,4},{5,6,7,8}};
					int secondArray[][]={{11,12,13,14},{67},{15,16,17,18}};
					
					System.out.println("This is the first array: ");
					display(firstArray);
					
					System.out.println();
					
					System.out.println("This is the second array: ");
					display(secondArray);
					
				}
				
				
				public static void display(int x[][])
				{
					for(int i=0;i < x.length; i++){
						for(int j=0;j < x[i].length;j++){
							System.out.print(x[i][j]+"\t");
						}
						System.out.println();
					}
				}
			}
	
	
	*/


//35 --variable length arguments ---u don't know how many arguments it will take...

	/*
		public class arrayInMethod 
		{
				public static void main(String[] args)
				{
				System.out.println(average(33,34,35));	
				}
				
				public static int average(int...numbers)
				{
					int total=0;
					for(int x:numbers)
					total+=x;
					return total/numbers.length;
				}
		}
	
	*/

class arrayInMethod{

public static void main(String[] args) {
		
		byte testbyte = 4;
		int testint = 46;
		long testlong = 44555;
		double testdouble = 2233.44;
		float testfloat = 44333.33f;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
	}

}




