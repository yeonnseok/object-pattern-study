package chapter04.composition;

public class Application {

    public static void main(String[] args) {
        FastFood fastFood = new FastFood(new Sprite("사이다"));
        fastFood.printName();
        fastFood.setBeverage(new Cola("코카 콜라"));
        fastFood.printName();
    }
}
