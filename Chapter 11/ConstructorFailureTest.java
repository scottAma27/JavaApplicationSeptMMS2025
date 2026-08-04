class SomeClass {
    public SomeClass(int value) throws Exception {
        if (value < 0) {
            throw new Exception("Constructor failed: value cannot be negative (" + value + ")");
        }
        System.out.println("SomeClass created successfully");
    }
}

public class ConstructorFailureTest {
    public static void main(String[] args) {
        try {
            new SomeClass(-5); // Will throw
        }
        catch (Exception ex) {
            System.out.println("Caught: " + ex.getMessage());
        }

        try {
            new SomeClass(10); // Will succeed
        }
        catch (Exception ex) {
            System.out.println("Caught: " + ex.getMessage());
        }
    }
}