// Write a java program using int[] arr = {7,8,4,3,2,9,0,1,6,8}; and collect all 
// the even numbers and display only the even number in the arrary using static method

public class EvenNumberFilterArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 3, 2, 9, 0, 1, 6, 8};
        
        displayEvenNumbers(arr);
    }
    
    // Static method to collect and display even numbers
    public static void displayEvenNumbers(int[] arr) {
     
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.printf("%d%n",num);
            }
        }
    }
}