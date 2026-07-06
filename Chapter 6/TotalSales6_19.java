import java.util.Scanner;

public class TotalSales6_19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] sales = new double[5][6]; // [product][salesperson]. Row0 and Col0 unused. Col5 = product total. Row5 = salesperson total

        System.out.println("Enter salesperson number 1-4, product number 1-5, total sale");
        System.out.println("Enter -1 for salesperson to end");

        System.out.print("Enter salesperson: ");
        int person = sc.nextInt();

        while (person!= -1) {
            System.out.print("Enter product number: ");
            int product = sc.nextInt();
            System.out.print("Enter total sale: ");
            double amount = sc.nextDouble();

            sales[product][person] += amount;
            sales[product][5] += amount; // product total
            sales[5][person] += amount; // salesperson total

            System.out.print("Enter salesperson: ");
            person = sc.nextInt();
        }

        // display table
        System.out.printf("%-12s", "Product");
        for (int i = 1; i <= 4; i++) System.out.printf("%12s%d", "Salesperson ", i);
        System.out.printf("%12s\n", "Total");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-12d", i);
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%12.2f", sales[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}