public class CompoundInterest4_14{
    public static void main(String[] args) {
        double principal = 1000.0; 
        int years = 10; 

        System.out.printf("%s%20s%n", "Rate", "Amount on deposit");

        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("%4.0f%%", rate * 100);
            double amount = principal * Math.pow(1.0 + rate, years);
            System.out.printf("%20.2f%n", amount);
        }
    }
}