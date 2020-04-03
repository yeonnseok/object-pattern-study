package chapter05.srp.object;

public class Latte extends DefaultCoffee {
    public Latte(final Temperature temperature, final boolean syrup) {
        super(temperature, syrup);
    }

    @Override
    public double price() {
        if (syrup) {
            return 5000;
        }
        return 4500;
    }

    @Override
    public int beans() {
        return 2;
    }
}
