package chapter04.inheritance;

public class Application {
    public static void main(String[] args) {
        Cola cola = new Cola("코카 콜라");
        cola.printName();
        cola.setSugar(80); // 80으로 바꿨지만, 적용되지않는다...
        ZeroCola zeroCola = new ZeroCola("제로 콜라");
        zeroCola.printName();
        System.out.println(zeroCola.getSugar());
    }
}
