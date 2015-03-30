package newboston;
public class timeClassMain 
	{
	
		public static void main(String[] args) 
		{
			
			timeClassMethod objectOfClass = new timeClassMethod();
			System.out.println(objectOfClass.timeFormatMilitary());	
			System.out.println(objectOfClass.timeFormatNormal());
			
			objectOfClass.setTime(24, 6, 7);
			System.out.println(objectOfClass.timeFormatMilitary());
			System.out.println(objectOfClass.timeFormatNormal());
	
		}
	
	}
