import java.security.SecureRandom;

public class TortoiseHare6_28{
    public static void main(String[] args) throws InterruptedException {
        SecureRandom rand = new SecureRandom();
        int tortoise = 1;
        int hare = 1;

        System.out.println("BANG!!!!!");
        System.out.println("AND THEY'RE OFF!!!!!");

        while (tortoise < 70 && hare < 70) {
           
            int t = 1 + rand.nextInt(10);
            if (t >= 1 && t <= 5) tortoise += 3;
            else if (t >= 6 && t <= 7) tortoise -= 6; 
            else tortoise += 1;
            if (tortoise < 1) tortoise = 1;

            
            int h = 1 + rand.nextInt(10);
            if (h >= 1 && h <= 2) hare += 0; 
            else if (h >= 3 && h <= 4) hare += 9; 
            else if (h == 5) hare -= 12; 
            else if (h >= 6 && h <= 8) hare += 1; 
            else hare -= 2; 
            if (hare < 1) hare = 1;

            printRace(tortoise, hare);
            Thread.sleep(10); 
        }

        if (tortoise >= 70 && hare >= 70) System.out.println("It's a tie.");
        else if (tortoise >= 70) System.out.println("TORTOISE WINS!!! YAY!!!");
        else System.out.println("Hare wins. Yuch.");
    }

    public static void printRace(int tPos, int hPos) {
        for (int i = 1; i <= 70; i++) {
            if (i == tPos && i == hPos) System.out.print("OUCH!!!");
            else if (i == tPos) System.out.print("T");
            else if (i == hPos) System.out.print("H");
            else System.out.print(" ");
        }
        System.out.println();
    }
}