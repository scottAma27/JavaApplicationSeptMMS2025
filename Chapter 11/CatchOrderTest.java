import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchOrderTest {
    public static void main(String[] args) {
        //  WRONG ORDER: superclass first → COMPILE ERROR
        /*
        try {
            throw new FileNotFoundException("Missing file");
        }
        catch (IOException ex) {} // Superclass
        catch (FileNotFoundException ex) {} // Subclass → unreachable!
        */

        //  CORRECT ORDER: subclass first, then superclass
        try {
            throw new FileNotFoundException("Missing file");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Handled specifically: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("Handled generally: " + ex.getMessage());
        }
    }
}