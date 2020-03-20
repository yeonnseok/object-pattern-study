package chapter02.demeter;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }
}
