import java.io.IOException;

class ExceptionA extends Exception {
    public ExceptionA(String msg) { super(msg); }
}
class ExceptionB extends ExceptionA {
    public ExceptionB(String msg) { super(msg); }
}

public class CatchAllTest {
    public static void main(String[] args) {
        // Throw ExceptionA
        try { throw new ExceptionA("ExceptionA occurred"); }
        catch (Exception ex) { System.out.println("Caught: " + ex.getMessage()); }

        // Throw ExceptionB
        try { throw new ExceptionB("ExceptionB occurred"); }
        catch (Exception ex) { System.out.println("Caught: " + ex.getMessage()); }

        // Throw NullPointerException
        try { String s = null; s.length(); }
        catch (Exception ex) { System.out.println("Caught: " + ex.getClass().getSimpleName() + " - " + ex.getMessage()); }

        // Throw IOException
        try { throw new IOException("File not found"); }
        catch (Exception ex) { System.out.println("Caught: " + ex.getClass().getSimpleName() + " - " + ex.getMessage()); }
    }
}