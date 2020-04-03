package chapter05.srp.object;

public abstract class DefaultCoffee implements Coffee {
    protected Temperature temperature;
    protected boolean syrup;

    public DefaultCoffee(Temperature temperature, boolean syrup) {
        this.temperature = temperature;
        this.syrup = syrup;
    }

    public boolean isSyrup() {
        return syrup;
    }
}
