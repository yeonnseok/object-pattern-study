package chapter05.srp.procedural;

public class CoffeeMachine {
    private static final int AMERICANO_PRICE = 4000;
    private static final int LATTE_PRICE = 4500;
    private static final int SYRUP_PRICE = 500;

    private int coffeeBean;
    private int money;

    public CoffeeMachine(int coffeeBean) {
        this.coffeeBean = coffeeBean;
    }

    public void insertMoney(final int money) {
        this.money = money;
    }

    public IceLatte buyIceLatte() {
        money -= LATTE_PRICE;
        coffeeBean -= 1;
        System.out.println("아이스 라떼를 구매하였습니다.");
        return new IceLatte();
    }

    public IceAmericano buyIceAmericano() {
        money -= AMERICANO_PRICE;
        coffeeBean -= 1;
        System.out.println("아이스 아메리카노를 구매하였습니다.");
        return new IceAmericano();
    }

    public HotLatte buyHotLatte() {
        money -= LATTE_PRICE;
        coffeeBean -= 1;
        System.out.println("따뜻한 라떼를 구매하였습니다.");
        return new HotLatte();
    }

    public HotAmericano buyHotAmericano() {
        money -= AMERICANO_PRICE;
        coffeeBean -= 1;
        System.out.println("따뜻한 아메리카노를 구매하였습니다.");
        return new HotAmericano();
    }

    public int getCoffeeBean() {
        return coffeeBean;
    }

    public int getMoney() {
        return money;
    }

    public IceLatte addSyrupToIceLatte(IceLatte iceLatte) {
        money -= SYRUP_PRICE;
        iceLatte.setSyrup(true);
        return iceLatte;
    }
}
