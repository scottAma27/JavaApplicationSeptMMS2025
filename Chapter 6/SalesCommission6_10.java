import java.util.Scanner;

public class SalesCommission6_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] salaryCount = new int[9]; // 9 salary ranges

        System.out.print("Enter salesperson's gross sales (-1 to end): ");
        double sales = sc.nextDouble();

        while(sales!= -1) {
            double salary = 200 + 0.09 * sales;
            int salaryInt = (int)salary;

            int index;
            if(salaryInt >= 1000) index = 8;
            else index = (salaryInt - 200) / 100;

            if(index >= 0 && index < 9) salaryCount[index]++;

            System.out.print("Enter salesperson's gross sales (-1 to end): ");
            sales = sc.nextDouble();
        }

        System.out.println("\nSalary Range Count");
        System.out.println("$200-299 " + salaryCount[0]);
        System.out.println("$300-399 " + salaryCount[1]);
        System.out.println("$400-499 " + salaryCount[2]);
        System.out.println("$500-599 " + salaryCount[3]);
        System.out.println("$600-699 " + salaryCount[4]);
        System.out.println("$700-799 " + salaryCount[5]);
        System.out.println("$800-899 " + salaryCount[6]);
        System.out.println("$900-999 " + salaryCount[7]);
        System.out.println("$1000 and over " + salaryCount[8]);
    }
}