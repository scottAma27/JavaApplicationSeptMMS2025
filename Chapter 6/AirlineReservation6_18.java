import java.util.Scanner;

public class AirlineReservation6_18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[11]; // 1-10, ignore 0
        int firstClass = 1, economy = 6;

        while(true) {
            System.out.print("Please type 1 for First Class, 2 for Economy, 3 to exit: ");
            int choice = sc.nextInt();
            if(choice == 3) break;

            boolean assigned = false;
            if(choice == 1) {
                for(int i = firstClass; i <= 5; i++) {
                    if(!seats[i]) { seats[i] = true; System.out.printf("Boarding Pass: Seat %d First Class\n", i); assigned = true; break; }
                }
                if(!assigned) {
                    System.out.print("First class full. Accept economy? 1=yes: ");
                    if(sc.nextInt() == 1) {
                        for(int i = economy; i <= 10; i++) if(!seats[i]) { seats[i] = true; System.out.printf("Boarding Pass: Seat %d Economy\n", i); assigned = true; break; }
                    }
                }
            } else {
                for(int i = economy; i <= 10; i++) {
                    if(!seats[i]) { seats[i] = true; System.out.printf("Boarding Pass: Seat %d Economy\n", i); assigned = true; break; }
                }
                if(!assigned) {
                    System.out.print("Economy full. Accept first class? 1=yes: ");
                    if(sc.nextInt() == 1) {
                        for(int i = firstClass; i <= 5; i++) if(!seats[i]) { seats[i] = true; System.out.printf("Boarding Pass: Seat %d First Class\n", i); assigned = true; break; }
                    }
                }
            }
            if(!assigned) System.out.println("Next flight leaves in 3 hours.");
        }
    }
}