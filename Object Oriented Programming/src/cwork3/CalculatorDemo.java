package cwork3;

public class CalculatorDemo {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Addition of 2 ints: " + calc.calculate(2, 3));
        
        System.out.println("Addition of 3 ints: " + calc.calculate(2, 3, 4));
        
        System.out.println("Addition of 2 doubles: " + calc.calculate(2.5, 3.5));
        
        System.out.println("Multiplication of 2 ints: " + calc.calculate(4, 5, true));
    }
}

