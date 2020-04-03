package chapter05.srp.object;

public class Americano extends DefaultCoffee {
    public Americano(Temperature temperature, boolean syrup) {
        super(temperature, syrup);
    }

    @Override
    public double price() {
        if (syrup) {
           return 4500;
        }
        return 4000;
    }

    @Override
    public int beans() {
        return 1;
    }
}
