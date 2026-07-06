public class PokerTest{
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];

        for (int i = 0; i < 5; i++) {
            hand1[i] = deck.dealCard();
            hand2[i] = deck.dealCard();
        }

        System.out.println("Hand 1:");
        for (Card c : hand1) System.out.println(c);
        System.out.println("Rank: " + deck.evaluateHand(hand1));

        System.out.println("\nHand 2:");
        for (Card c : hand2) System.out.println(c);
        System.out.println("Rank: " + deck.evaluateHand(hand2));

        int r1 = deck.evaluateHand(hand1);
        int r2 = deck.evaluateHand(hand2);
        if (r1 > r2) System.out.println("\nHand 1 wins!");
        else if (r2 > r1) System.out.println("\nHand 2 wins!");
        else System.out.println("\nTie!");
    }
}