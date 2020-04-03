package chapter05.srp.object;

public class Application {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(5);

        coffeeMachine.insert(20000);
        coffeeMachine.buy(new Americano(Temperature.HOT, true));
        coffeeMachine.buy(new Americano(Temperature.COLD, false));
        coffeeMachine.buy(new Latte(Temperature.HOT, true));
        coffeeMachine.buy(new Latte(Temperature.COLD, false));

        coffeeMachine.cancel();
    }
}
