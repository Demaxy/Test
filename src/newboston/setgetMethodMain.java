package newboston;
import java.util.EnumSet;

public class setgetMethodMain 
{
		public static void main(String[] args) 
		{
			
// creating setgetMethod objects from different constructors 
			
			/*setgetMethod setgetObject = new  setgetMethod();
			setgetMethod setgetObject2 = new setgetMethod(5);
			setgetMethod setgetObject3 = new setgetMethod(5,13);
			setgetMethod setgetObject4 = new setgetMethod(5,13,43);
			
			System.out.println(setgetObject.timeFormatMilitary());	
			System.out.println(setgetObject2.timeFormatMilitary());
			System.out.println(setgetObject3.timeFormatMilitary());
			System.out.println(setgetObject4.timeFormatMilitary());*/
			
// creating object for printString class
			
			/*printString printStingObject = new printString(4,5,6);*/
	
	
// build object for tuna class	
			/*tuna tunaObject = new tuna("Greg", printStingObject);
			System.out.println(tunaObject);*/
			
			
// Printing... building an enhance for loop (tunac.values is a built in array of the constants in enum; values is called static method which can't be changed. )
// so it loops thru each of the constant ...bucky()...kelsey()...julia()...and assign them to x 
			for (tunac x: tunac.values())
			System.out.printf("%s\t%s\t%s\n", x, x.getDesc(),x.getYear());
			
			
// to print only a range in the enum constant ... instead of everything we use the EnumSet class with a built in method called range.			
			System.out.println("\nAnd now for the range of constants!!!\n");
			
			for (tunac x: EnumSet.range(tunac.kelsey, tunac.julia))
			System.out.printf("%s\t%s\t%s\n", x, x.getDesc(),x.getYear());
				
			
			System.out.println("\n#############################################################################\n\n");
//object for staticVariable
			staticVariable member1 = new staticVariable("Megan", "Fox");
			staticVariable member2 = new staticVariable("Natalie", "Port");
			staticVariable member3 = new staticVariable("Tomi", "Oke");
			
			
			System.out.println();
			System.out.println(staticVariable.getMembers());
							
		}
}
