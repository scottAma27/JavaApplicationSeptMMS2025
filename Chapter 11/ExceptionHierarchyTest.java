class ExceptionA extends Exception {
    public ExceptionA(String msg) { super(msg); }
}
class ExceptionB extends ExceptionA {
    public ExceptionB(String msg) { super(msg); }
}
class ExceptionC extends ExceptionB {
    public ExceptionC(String msg) { super(msg); }
}

public class ExceptionHierarchyTest {
    public static void main(String[] args) {
        // Test ExceptionB
        try {
            throw new ExceptionB("This is ExceptionB");
        }
        catch (ExceptionA ex) { // Catches ExceptionB
            System.out.println("Caught by ExceptionA handler: " + ex.getMessage());
        }
