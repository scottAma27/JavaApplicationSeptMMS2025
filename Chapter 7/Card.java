public class Card{
    private final Face face;
    private final Suit suit;

    public Card(Face cardFace, Suit cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public Face getFace() { return face; }
    public Suit getSuit() { return suit; }

    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}