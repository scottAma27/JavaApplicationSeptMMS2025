import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards() {
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        int count = 0;
        for (Suit suit : Suit.values()) {
            for (Face face : Face.values()) {
                deck[count++] = new Card(face, suit);
            }
        }
    }

    // 7.21 Fisher-Yates shuffle
    public void shuffle() {
        currentCard = 0;
        for (int i = deck.length - 1; i > 0; i--) {
            int j = randomNumbers.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }

    // Helper: count faces
    private int[] getFaceCounts(Card[] hand) {
        int[] counts = new int[Face.values().length];
        for (Card c : hand) counts[c.getFace().ordinal()]++;
        return counts;
    }

    // a) pair
    public boolean hasPair(Card[] hand) {
        for (int c : getFaceCounts(hand)) if (c == 2) return true;
        return false;
    }

    // b) two pairs
    public boolean hasTwoPairs(Card[] hand) {
        int pairs = 0;
        for (int c : getFaceCounts(hand)) if (c == 2) pairs++;
        return pairs == 2;
    }

    // c) three of a kind
    public boolean hasThreeOfAKind(Card[] hand) {
        for (int c : getFaceCounts(hand)) if (c == 3) return true;
        return false;
    }

    // d) four of a kind
    public boolean hasFourOfAKind(Card[] hand) {
        for (int c : getFaceCounts(hand)) if (c == 4) return true;
        return false;
    }

    // e) flush
    public boolean hasFlush(Card[] hand) {
        Suit s = hand[0].getSuit();
        for (Card c : hand) if (c.getSuit()!= s) return false;
        return true;
    }

    // f) straight
    public boolean hasStraight(Card[] hand) {
        int[] faces = new int[5];
        for (int i = 0; i < 5; i++) faces[i] = hand[i].getFace().ordinal();
        Arrays.sort(faces);
        for (int i = 1; i < 5; i++) if (faces[i]!= faces[i-1] + 1) return false;
        return true;
    }

    // g) full house
    public boolean hasFullHouse(Card[] hand) {
        return hasThreeOfAKind(hand) && hasPair(hand);
    }

    // Hand ranking: higher number = better hand
    public int evaluateHand(Card[] hand) {
        if (hasStraight(hand) && hasFlush(hand)) return 9; // Straight flush
        if (hasFourOfAKind(hand)) return 8;
        if (hasFullHouse(hand)) return 7;
        if (hasFlush(hand)) return 6;
        if (hasStraight(hand)) return 5;
        if (hasThreeOfAKind(hand)) return 4;
        if (hasTwoPairs(hand)) return 3;
        if (hasPair(hand)) return 2;
        return 1; // High card
    }
}