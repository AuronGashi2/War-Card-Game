/**
 * Card  models a playing card
 */
public class Card { // definitions that one can use to describe the value of a card:
    public static final String SPADES = "spades";
    public static final String HEARTS = "hearts";
    public static final String DIAMONDS = "diamonds";
    public static final String CLUBS = "clubs";

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static final int SIZE_OF_ONE_SUIT = 13;  // how many cards in one suit
    public String a = "";//turn 11,12,13,1 to Jack, Queen, King and Ace

    // These are the card's at tributes:
    private String suit;
    private int count;

    /**
     * Constructor  Card  sets the suit and count.
     *
     * @param s - the suit
     * @param c - the count
     */
    public Card(String s, int c) {
        suit = s;
        count = c;
    }

    /**
     * getSuit re
     * [turns the card's suit.
     */
    public String getSuit() {
        return suit;
    }

    /**
     * getCount returns the card's count.
     */
    public int getCount() {
        return count;
    }

    //countOf returns a string of jack,quee,king or ace
    public String countOf() {
        switch (getCount()) {
            case 1:
                a = "Ace";
                break;
            case 11:
                a = "JACK";
                break;
            case 12:
                a = "QUEEN";
                break;
            case 13:
                a = "KING";
                break;
            default:
                a = "not";
        }
        if (a.equals("not")) {
            a = getCount() + "";
        }
        return a;
    }
}