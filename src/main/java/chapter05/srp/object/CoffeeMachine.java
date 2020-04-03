package chapter05.srp.object;

public class CoffeeMachine implements VendingMachine {
    private Money money;
    private CoffeeBean coffeeBean;

    public CoffeeMachine(int coffeeBean) {
        this.coffeeBean = new CoffeeBean(coffeeBean);
    }

    @Override
    public void insert(final double money) {
        this.money = new Money(money);
        System.out.println(String.format("투입 금액 : %.1f, 구매 가능 커피 수 : %d", money, coffeeBean.getCoffeeBean()));
    }

    @Override
    public Coffee buy(final Coffee coffee) {
        money.buy(coffee);
        coffeeBean.useFor(coffee);
        System.out.println(String.format("%s를 구매했습니다. 구매 가능 커피 수 : %d", coffee.getClass().getSimpleName(), coffeeBean.getCoffeeBean()));
        return coffee;
    }

    @Override
    public void cancel() {
        System.out.println(String.format("거스름돈은 %.1f 입니다.", money.getMoney()));
        money.initialize();
    }
}
