package chapter05.srp.object;

public class CoffeeBean {
    private int coffeeBean;

    public CoffeeBean(int coffeeBean) {
        this.coffeeBean = coffeeBean;
    }

    public int getCoffeeBean() {
        return coffeeBean;
    }

    public void useFor(final Coffee coffee) {
        if (coffeeBean - coffee.beans() <= 0) {
            throw new IllegalArgumentException("원두가 부족합니다.");
        }
        coffeeBean -= coffee.beans();
    }
}
