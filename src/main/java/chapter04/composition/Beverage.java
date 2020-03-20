package chapter04.composition;

public abstract class Beverage {
    private String name;

    public Beverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void drink();

    abstract void empty();
}
