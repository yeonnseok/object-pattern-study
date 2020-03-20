package chapter04.inheritance;

public class Sprite extends FastFood {
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
