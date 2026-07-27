package cwork8;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        Employee e3 = new ContractEmployee();
        System.out.println("FullTime Salary: N" + String.format("%,.2f", e1.calculateSalary()));
        System.out.println("PartTime Salary: N" + String.format("%,.2f", e2.calculateSalary()));
        System.out.println("Contract Salary: N" + String.format("%,.2f", e3.calculateSalary()));
    }
}

