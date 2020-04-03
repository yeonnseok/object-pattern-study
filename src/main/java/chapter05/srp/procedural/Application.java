package chapter05.srp.procedural;

public class Application {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(5);
        int money = 20000;
        coffeeMachine.insertMoney(money);
        System.out.println(String.format("투입 금액 : %d", money));
        System.out.println(String.format("구매 가능 커피 수 : %d", coffeeMachine.getCoffeeBean()));

        IceLatte iceLatte = coffeeMachine.buyIceLatte();
        iceLatte = coffeeMachine.addSyrupToIceLatte(iceLatte);
        IceAmericano iceAmericano = coffeeMachine.buyIceAmericano();
        HotLatte hotLatte = coffeeMachine.buyHotLatte();
        HotAmericano hotAmericano = coffeeMachine.buyHotAmericano();

        System.out.println(String.format("남은 금액 : %d", coffeeMachine.getMoney()));
        System.out.println(String.format("구매 가능 커피 수 : %d", coffeeMachine.getCoffeeBean()));
    }
}
