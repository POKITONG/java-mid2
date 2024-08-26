package collection.compare.test;

import java.util.*;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initializeCards(cards);
    }

    private void initializeCards(List<Card> cards) {
        for (int i = 1; i <= 13; i++) {
            for (Pattern pattern : Pattern) {
                cards.add(i, pattern);
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }
}
