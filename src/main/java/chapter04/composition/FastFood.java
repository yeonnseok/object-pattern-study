package chapter04.composition;

public class FastFood implements Eatable {
    private Beverage beverage;

    public FastFood(Beverage beverage) {
        this.beverage = beverage;
    }

    public void setBeverage(Beverage targetBeverage) {
        this.beverage = targetBeverage;
    }

    public void printName() {
        System.out.println(beverage.getName());
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
