public class VariableLengthArgumentC_W{
    public static void main (String [] args){
        System.out.printf("Odd numbers: %d%n",odds(5,6,8,9,3,2,1));
        System.out.printf("Odd numbers: %d%n",odds(1,6,4,7,5,6));
        System.out.printf("Odd numbers: %d%n",odds(5,6,8,9,4));
        System.out.printf("Odd numbers: %d%n",odds(5,6,8,6));
        System.out.printf("Odd numbers: %d%n",odds(5,6,8));
        System.out.printf("Odd numbers: %d%n",odds(5,6));
        System.out.printf("Odd numbers: %d%n",odds(5));
        System.out.printf("Odd numbers: %d%n",odds());
    }
    
    public static int odds(int... numbers){
		
		int count = 0;
		
        for(int number : numbers){
            if(number % 2 != 0){
                count++;
            }
			
        }
		return count;
    }
}