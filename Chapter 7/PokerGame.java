import java.util.Scanner;

public class PokerGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] player = new Card[5];
        Card[] dealer = new Card[5];
        for (int i = 0; i < 5; i++) {
            player[i] = deck.dealCard();
            dealer[i] = deck.dealCard();
        }

        System.out.println("Your hand:");
        for (int i = 0; i < 5; i++) System.out.printf("%d: %s\n", i+1, player[i]);

        System.out.print("Enter card numbers 1-5 to discard separated by space, or 0 to keep all: ");
        String[] input = sc.nextLine().split(" ");
        if (!input[0].equals("0")) {
            for (String s : input) {
                int idx = Integer.parseInt(s) - 1;
                player[idx] = deck.dealCard();
            }
        }

        // Dealer AI: discard if no pair or better
        int dealerRank = deck.evaluateHand(dealer);
        if (dealerRank < 3) { // less than 2 pair, discard 3
            for (int i = 0; i < 3; i++) dealer[i] = deck.dealCard();
        }

        System.out.println("\nYour final hand:");
        for (Card c : player) System.out.println(c);
        System.out.println("Rank: " + deck.evaluateHand(player));

        System.out.println("\nDealer final hand:");
        for (Card c : dealer) System.out.println(c);
        System.out.println("Rank: " + deck.evaluateHand(dealer));

        int p = deck.evaluateHand(player);
        int d = deck.evaluateHand(dealer);
        if (p > d) System.out.println("You win!");
        else if (d > p) System.out.println("Dealer wins!");
        else System.out.println("Tie!");
    }
}