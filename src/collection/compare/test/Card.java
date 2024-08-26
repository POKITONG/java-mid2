package collection.compare.test;

import static collection.compare.test.Pattern.*;

public class Card implements Comparable<Card> {

    private int number;
    private Pattern pattern;

    public Card(int number, Pattern pattern) {
        this.number = number;
        this.pattern = pattern;
    }

    public int getNumber() {
        return number;
    }

    public Pattern getPattern() {
        return pattern;
    }

    @Override
    public int compareTo(Card o) {
        if (this.number != o.number) {
            return Integer.compare(this.number, o.number);
        } else {
            return this.pattern.compareTo(o.pattern);
        }
    }

    @Override
    public String toString() {
        return number + "(" + pattern.getIcon() + ")";
    }
}
