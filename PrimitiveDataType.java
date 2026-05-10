public class PrimitiveDataType{
	public static void main (String [] agrs){
		byte myAge = 30;
		System.out.printf("Miss mercy is %d years old%n",myAge);
		
		short quantity = 20000;
		System.out.printf("The quantity of phone ordered is %,d%n",quantity);
		
		int nigeriaPopulation = 294848848;
		System.out.printf("The population of Nigeria is %,d%n",nigeriaPopulation);
		
		long worldPopulation = 47474778474874874L;
		System.out.printf("The world population is %,d%n",worldPopulation);
		
		float price = 577858.84223F;
		System.out.printf("The price of each iphone per unit is %,.2f%n",price);
		
		double myBalance = 363726273837332.363267;
		System.out.printf("My account balanve is %c%,.2f%n",'$',myBalance);
		
		char symbol = '%';
		System.out.printf("There is an increament in the worlds's population by 20.5%c%n",symbol);
		
		boolean isJavaFun = true;
		System.out.printf("Do you ove java? %b",isJavaFun);
	}
}