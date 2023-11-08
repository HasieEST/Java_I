package Week8Exercise15;

public class Card implements Comparable<Card> {

    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;
    public static final String[] suites = { "Spades", "Diamonds", "Hearts", "Clubs" };
    public static final String[] values = { "-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
            "A" };

    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return values[value] + " of " + suites[suit];
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Card o) {
        if (value - o.getValue() == 0) {
            return suit - o.getSuit();
        }
        return value - o.getValue();
    }

}
