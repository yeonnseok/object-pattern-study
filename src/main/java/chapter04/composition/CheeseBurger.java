package chapter04.composition;

public class CheeseBurger extends Burger{
    public CheeseBurger(String name) {
        super(name);
    }

    @Override
    boolean isDoublePatty() {
        return false;
    }
}
