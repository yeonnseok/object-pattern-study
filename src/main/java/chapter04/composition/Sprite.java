package chapter04.composition;

public class Sprite extends Beverage {
    public Sprite(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("사이다를 마십니다.");
    }

    @Override
    public void empty() {
        System.out.println("사이다를 다 마셨습니다.");
    }
}
