package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        cards = new ArrayList<>();
    }

    public void pick(Card card) {
        cards.add(card);
    }

    public String getCards() {
        return cards.toString();
    }
}
