public class EvenNumberFilterArray {
    public static void main(String[] args) {
		int[] arr = {7, 8, 4, 3, 2, 9, 0, 1, 6, 8};
		
		int[] allEven = displayEvenNumbers(arr);
		for (int num : allEven){
			System.out.println(num);
		}
    }
   
    public static void displayEvenNumbers(int[] numbers){
		int index = 0;
		int[] even = new int [6];
		
		for(int i = 0; i < numbers.lenght; i++){
			if{numbers[i] & 2 == 0}{
				int[index]  = numbers[i];
				idex++;

			}
		}
		return even;
	}