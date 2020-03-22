package chapter04.composition;

public class Application {

    public static void main(String[] args) {
        FastFood fastFood = new FastFood(new CheeseBurger("치즈버거"), new Cola("콜라", 100));
        fastFood.printName();
        System.out.println(fastFood.getBeverageSugar());

        fastFood.setBurger(new BigMacBurger("빅맥"));
        fastFood.setBeverage(new Sprite("사이다", 60));
        fastFood.printName();
        System.out.println(fastFood.getBeverageSugar());
    }
}
