//package newboston;
//import java.util.Scanner;
//public class bank {
//	String fn,sn,ac_no,type;
//	double balance;
//	Scanner x = new Scanner(System.in);
//	
//	
//	void setAccount(){
//		try{
//			System.out.println("Enter user's first name ");
//			fn = x.nextLine();
//			if (fn.contains(null)) 
//			{throw new exception e
//			
//			catch(Exception e )
//			{
//				System.out.println("Please enter first name correctly");
//				
//			} 
//		
//		try{
//			System.out.println("Enter user's second name ");
//			sn = x.nextLine();
//				if(sn.contains(null)){
//					
//				}
//			}
//			catch(Exception e){
//				System.out.println("Please enter second name correctly");
//				setAccount();
//			}
//		try
//		{
//			System.out.println("Enter user's account no. ");
//			ac_no = x.nextLine();
//				if(ac_no.contains(null)){
//					
//				}
//			}
//			catch(Exception e){
//				System.out.println("Please enter account No. correctly");
//		}
//		System.out.println("Enter account type ");
//		type = x.nextLine();
//			if(type.equals("Savings") || type.equals("savings")){
//				
//			}
//			else if(type.equals("Current" ) || type.equals("current")) {
//				
//			}
//			else
//				System.out.println("Not correct account type");
//				type = "NOT SET";
//			
//			if(type.equals("NOT SET"))
//				setAccount();
//			
//		System.out.println("Enter the amount you want to deposit initially ");
//		balance = x.nextDouble();
//			if(type.equals("NOT SET")){
//				System.out.println("Not correct account type to deposit money");
//				balance = 0;
//				setAccount();
//			}
//			if(balancebalance){
//			System.out.println("Not enough balance to withdraw ");
//			b = 0;
//		}
//		else
//			System.out.println("The amount withdrawn " + b);
//			balance = balance -b ;
//		display();
//	}
//	
//	void display(){
//		
//		System.out.println("Your balance is " +balance);
//	}
//	
//	void details(){
//		System.out.println("Your name is " +fn + " " +sn);
//		System.out.println("Your account no. is " +ac_no);
//		System.out.println("Your account type is " + type);
//		System.out.println("Your balance is " + balance);
//	}
//	
//	public static void main(String args[]https://www.thenewboston.com/images/emoticons/wink.png{
//		Scanner y = new Scanner(System.in);
//		bank b1 = new bank();
//		b1.setAccount();
//			
//		int ch;
//		
//		while(true){
//			System.out.println("Enter your choice: ");
//			System.out.println("");
//			System.out.println("Press 1 to deposit");
//			System.out.println("Press 2 to withdraw");
//			System.out.println("Press 3 for details");
//			System.out.println("Press 4 to Reset ");
//			System.out.println("Enter any value to exit ");
//			
//			ch = y.nextInt();
//			switch (ch){
//				
//			case 1:
//				b1.depositAcc();
//				break;
//			case 2:
//				b1.withdrAcc();
//				break;
//			case 3:
//				b1.details();
//				break;
//			case 4:
//				b1.setAccount();
//				break;
//			default:
//				System.out.println("Enter correct choice ");
//				break;
//				
//		  }
//			
//	  }
//	}
//}
