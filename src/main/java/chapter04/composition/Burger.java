package chapter04.composition;

public abstract class Burger {
    private String name;

    public Burger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract boolean isDoublePatty();

}
