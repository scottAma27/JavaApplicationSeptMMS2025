public class TypeCasting {
	public static void main (String [] args){
		//Implicit TypeCasting(Wiled TypeCasting)
		double price = 7858;
		System.out.printf("The price of laptop is %f%n",price);
		
		//Explicit TypeCasting(Narrowing TypeCasting)
		double balance = 5693.2875;
		int convertedBalance = (int)balance;
		System.out.printf("The converted balance is %d%n",convertedBalance);

		int num1 = 50;
		int num2 = 200;
		double division = (double)num1/num2;
		System.out.printf("The division is %f%n",division);
		
		char symbol = '?';
		int convertedSymbol = (int)symbol;
		System.out.printf("The converted symbol is %d%n",convertedSymbol);
	}
}