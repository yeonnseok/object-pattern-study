package chapter04.inheritance;

public class CheeseBurgerSprite extends FastFood {
    private int sugar = 60;

    public CheeseBurgerSprite(String name) {
        super(name);
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public boolean isDoublePatty() {
        return false;
    }

    @Override
    public void drink() {
        System.out.println("음료를 마십니다.");
    }

    @Override
    public void empty() {
        System.out.println("음료를 다 마셨습니다.");
    }
}
