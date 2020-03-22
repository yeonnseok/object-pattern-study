package chapter04.composition;

public class BigMacBurger extends Burger {
    public BigMacBurger(String name) {
        super(name);
    }

    @Override
    boolean isDoublePatty() {
        return true;
    }
}
