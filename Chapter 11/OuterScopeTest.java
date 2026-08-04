public class OuterScopeTest {
    static void innerMethod() throws ArithmeticException {
        try {
            int a = 10 / 0; // Throws here
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Inner caught array error only");
        }
        // ArithmeticException is NOT caught here → propagates out
    }

    public static void main(String[] args) {
        try {
            innerMethod();
        }
        catch (ArithmeticException ex) {
            System.out.println("Outer scope caught the slipped-through error: " + ex.getMessage());
        }
    }
}