public class OperatorsPart1{
	public static void main (String [] args){
		// Asignment Oparator (=) it's used to asign a variable to a oparator
		int num = 200;
		System.out.printf("The value of num is %dd%n",num);
		
		// Arithmetic Oparators(+,-,/,*,%)
		int num1 = 80;
		int num2 = 100;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		double division = (double) num1/num2;
		int multiplication = num1 * num2;
		int remainder = num1 % num2;
		
		System.out.printf("%d + %d = %d%n", num1,num2,addition);
		System.out.printf("%d - %d = %d\n", num1,num2,subtraction);
		System.out.printf("%d / %d = %.1f%n", num1,num2,division);
		System.out.printf("%d x %d = %d%n", num1,num2,multiplication);
		System.out.printf("%d %% %d = %d%n", num1,num2,remainder);

		// Compound assignment oparator(+=,-=,*=,/=,%=)
		
		num1 += num2;
		System.out.printf("The value of num1 has been updated to %d%n", num1);
		
		
		num1 -= num2;
		System.out.printf("The value of num1 has been updated to %d%n", num1);
		
		num1 *= num2;
		System.out.printf("The value of num1 has been updated to %d%n", num1);

		num1 /= num2;
		System.out.printf("The value of num1 has been updated to %d%n", num1);

		num1 %= num2;
		System.out.printf("The value of num1 has been updated to %d%n", num1);

		System.out.println("");
		System.out.println("==================");
		
		// New topic Relational operators or Comparison: helps to compar two similar oparaors 
		
		int number1 = 15;
		int number2 = 30;
		
		boolean isGreater = number1 > number2;
		System.out.printf("Is %d > %d: %b%n",number1,number2,isGreater);
		
		boolean isLessThan = number1 < number2;
		System.out.printf("Is %d < %d: %b%n",number1,number2,isLessThan);
		
		boolean isGreaterOrEqualTo = number1 >= number2;
		System.out.printf("Is %d >= %d: %b%n",number1,number2,isGreaterOrEqualTo);
		
		boolean isLessThanOrEqualTo = number1 <= number2;
		System.out.printf("Is %d <= %d: %b%n",number1,number2,isLessThanOrEqualTo);
		
		boolean isEqualTo = number1 == number2;
		System.out.printf("Is %d == %d: %b%n",number1,number2,isEqualTo);

		boolean isNotEqualTo = number1 != number2;
		System.out.printf("Is %d != %d: %b%n",number1,number2,isNotEqualTo);

	}

}