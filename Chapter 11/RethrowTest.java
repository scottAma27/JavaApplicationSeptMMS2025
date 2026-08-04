public class RethrowTest {
    static void someMethod2() throws ArithmeticException {
        throw new ArithmeticException("Original error from someMethod2");
    }

    static void someMethod() throws ArithmeticException {
        try {
            someMethod2();
        }
        catch (ArithmeticException ex) {
            System.out.println("someMethod caught — rethrowing...");
            throw ex; // Pass it up the chain
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        }
        catch (ArithmeticException ex) {
            System.out.println("Main caught the rethrown exception:");
            ex.printStackTrace();
        }
    }
}