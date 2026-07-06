/*
	Topic: Variable lenght arguments. it is also called varargs.
		It allows them to handle diffrent numbers of inputs without creating many 
		overloaded versions.
		It allows a method to accept a variable number of arguments of the same data type. This means you can pass 
		zero, one or many argumentsto a single method.
*/

public class VariableLengthArgument{
	public static void main (String [] args){
		System.out.printf("The sum is %d%n",addition(5,6,8,9,3,2,1));
		System.out.printf("The sum is %d%n",addition(1,6,4,7,5,6));
		System.out.printf("The sum is %d%n",addition(5,6,8,9,4));
		System.out.printf("The sum is %d%n",addition(5,6,8,6));
		System.out.printf("The sum is %d%n",addition(5,6,8));
		System.out.printf("The sum is %d%n",addition(5,6));
		System.out.printf("The sum is %d%n",addition(5));
		System.out.printf("The sum is %d%n",addition());
	}
	public static int addition(int... numbers){
		int sum = 0;
		for(int number : numbers){
			sum += number;
		}
		return sum;
	}
}