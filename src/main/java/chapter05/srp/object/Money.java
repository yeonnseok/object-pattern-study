package chapter05.srp.object;

public class Money {
    private double money;

    public Money(double money) {
        this.money = money;
    }


    public void buy(final Coffee coffee) {
        money -= coffee.price();
    }

    public double getMoney() {
        return money;
    }

    public void initialize() {
        money = 0;
    }
}
