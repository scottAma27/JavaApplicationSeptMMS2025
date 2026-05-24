/* Logical Oparator: they are usd to join expression or statement together. 
		they always return a boolean result(true or false)
		types of logical opartors: And(&&), Not(!), Or(||)
*/
		// Logical Oparators (&&,||,!)
public class OparatorPart2{
	public static void main (String [] args){
		int num1 = 15;
		int num2 = 30;
		int num3 = 18;
		
		boolean andOparator = (num1 > num2) && (num1 > num3);
		System.out.printf("Is (%d > %d) && (%d > %d): %b%n",num1,num2,num1,num3,andOparator);
		
		boolean orOparator = (num1 > num2) || (num1 > num3);
		System.out.printf("Is (%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3,orOparator);
		
		boolean notOparator = !((num1 > num2) || (num1 > num3));
		System.out.printf("Is !((%d > %d) || (%d > %d)): %b%n",num1,num2,num1,num3,notOparator);
		
		System.out.println("");
		System.out.println("==================");
		
		/* Unary oparators: (++,--)
				types
		1. increment Unary Op.(++)
			1. pre-increment(++x) 
			2. 
			
		2. decrement unary Op.(--)
		*/
		
		int x = 5;
		int y = 10;
		System.out.printf("The value of x is %d%n",++x); // the oparator acts before showing the variable
		System.out.printf("The value of y is %d%n",y++); // it shows the veriable before the oparator starts acting
		System.out.printf("The value of y is %d%n",y);
		
		System.out.println("");
		System.out.println("==================");
		
		System.out.printf("The value of x is %d%n",--x);
		System.out.printf("The value of y is %d%n",y--); // it shows the veriable before the oparator starts acting 
		System.out.printf("The value of y is %d%n",--y); // the oparator acts before showing the variable
	}
}