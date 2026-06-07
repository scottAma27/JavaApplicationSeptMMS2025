import java.util.Scanner;

public class FairTaxCalculator4_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalExpenses = 0;

        System.out.println("Enter your estimated annual expenses in each category:");
        System.out.print("Housing: ");
        totalExpenses += scanner.nextDouble();
        System.out.print("Food: ");
        totalExpenses += scanner.nextDouble();
        System.out.print("Clothing: ");
        totalExpenses += scanner.nextDouble();
        System.out.print("Transportation: ");
        totalExpenses += scanner.nextDouble();
        System.out.print("Education: ");
        totalExpenses += scanner.nextDouble();
        System.out.print("Health care: ");
        totalExpenses += scanner.nextDouble();
        System.out.print("Vacations: ");
        totalExpenses += scanner.nextDouble();

        double fairTaxRate = 0.23; // 23% FairTax rate
        double fairTax = totalExpenses * fairTaxRate;

        System.out.printf("Estimated annual FairTax: $%.2f%n", fairTax);
        System.out.printf("Estimated monthly FairTax: $%.2f%n", fairTax / 12);
    }
}