public class Factorials4_13{
    public static void main(String[] args) {
        System.out.printf("%s%20s%n", "n", "n!");
        for (int n = 1; n <= 20; n++) {
            long fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.printf("%2d%20d%n", n, fact);
        }
    }
}