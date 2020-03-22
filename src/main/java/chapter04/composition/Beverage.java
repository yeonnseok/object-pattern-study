package chapter04.composition;

public abstract class Beverage {
    private String name;
    private int sugar;

    public Beverage(String name, int sugar) {
        this.name = name;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public int getSugar() {
        return sugar;
    }

    abstract void drink();

    abstract void empty();
}
