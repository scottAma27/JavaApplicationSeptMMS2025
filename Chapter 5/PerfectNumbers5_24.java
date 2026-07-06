public class PerfectNumbers5_24{
    public static boolean isPerfect(int number) {
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) sum += i;
        }
        return sum == number;
    }
    
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++) {
            if(isPerfect(i)) {
                System.out.print(i + " = ");
                for(int j = 1; j < i; j++) if(i % j == 0) System.out.print(j + " + ");
                System.out.println();
            }
        }
    }
}