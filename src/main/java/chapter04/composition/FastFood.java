package chapter04.composition;

public class FastFood implements Eatable {
    private Burger burger;
    private Beverage beverage;

    public FastFood(Burger burger, Beverage beverage) {
        this.burger = burger;
        this.beverage = beverage;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public void setBeverage(Beverage targetBeverage) {
        this.beverage = targetBeverage;
    }

    public void printName() {
        System.out.println(burger.getName() + "+" + beverage.getName());
    }

    public int getBeverageSugar() {
        return beverage.getSugar();
    }

    @Override
    public void buy() {
        System.out.println("음식을 구매했습니다.");
    }

    @Override
    public void eat() {
        System.out.println("음식을 먹습니다.");
    }

    @Override
    public void clean() {
        System.out.println("쓰레기를 정리합니다.");
    }
}
