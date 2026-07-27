import java.util.Scanner;

public class EmployeeSalary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Hours Worked: ");
        double hours = sc.nextDouble();

        System.out.print("Enter Hourly Rate: $");
        double rate = sc.nextDouble();

        // 1. Calculate Gross Salary
        double grossSalary;
        if(hours > 40) { // overtime: 1.5x rate
            grossSalary = 40 * rate + (hours - 40) * rate * 1.5;
        } else {
            grossSalary = hours * rate;
        }

        // 2. Calculate Tax - Example: 15% tax
        double taxRate = 0.15;
        double tax = grossSalary * taxRate;

        // 3. Calculate Net Salary
        double netSalary = grossSalary - tax;

        // Display Payslip
        System.out.println("\n===== EMPLOYEE PAYSLIP =====");
        System.out.println("Employee Name: " + name);
        System.out.printf("Hours Worked: %.2f\n", hours);
        System.out.printf("Hourly Rate: $%.2f\n", rate);
        System.out.printf("Gross Salary: $%.2f\n", grossSalary);
        System.out.printf("Tax 15%%: $%.2f\n", tax);
        System.out.printf("Net Salary: $%.2f\n", netSalary);
        System.out.println("============================");

        sc.close();
    }
}