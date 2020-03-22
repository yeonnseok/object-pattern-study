package chapter04.composition;

public class Cola extends Beverage {
    public Cola(String name, int sugar) {
        super(name, sugar);
    }

    @Override
    public void drink() {
        System.out.println("코카 콜라를 마십니다.");
    }

    @Override
    public void empty() {
        System.out.println("코카 콜라를 다 마셨습니다.");
    }
}
