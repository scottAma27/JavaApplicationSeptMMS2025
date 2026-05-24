		/* Operators Precedence: The y are rules applied when dealing with hybrid equations 
		that involve more than one type of opertors.
		In such cases, these rules determine which paert of the equation to consider first, as there can be many different
		valuations for the same equation.
		*/

public class OperatorPrecedence{
	public static void main (String [] args){
		// 2x^2*2y-(2x^2+3y)*2x^2 
		
		int x = 2;
		int y = 3;
		int equation = 2*2*2*2*3 -(2*2*2+3*3)*2*2*2;
		System.out.printf("The result of the equation is %d%n",equation);
	}
}