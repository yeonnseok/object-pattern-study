package chapter02.demeter;

public class Card {
    private final int number;
    private final String name;

    public Card(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
