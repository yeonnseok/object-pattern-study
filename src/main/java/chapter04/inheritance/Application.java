package chapter04.inheritance;

public class Application {
    public static void main(String[] args) {
        CheeseBurgerCola fastFood = new CheeseBurgerCola("치즈버거 + 콜라");
        fastFood.printName();
        System.out.println(fastFood.getSugar());

        fastFood = new CheeseBurgerZeroCola("치즈버거 + 제로콜라");
        fastFood.printName();
        System.out.println(fastFood.getSugar());

//        fastFood = new CheeseBurgerSprite("치즈버거 + 사이다");
        fastFood.printName();
        System.out.println(fastFood.getSugar());

    }
}
