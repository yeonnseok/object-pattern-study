package chapter02.demeter;

import java.util.List;

public class Player {
    private Cards cards;

    public List<Card> getCards() {
        return cards.getCards();
    }

//    public Cards getCards() {
//        return cards;
//    }
}
