package chapter04.inheritance;

public class CheeseBurgerCola extends FastFood {
    private int sugar = 100;

    public CheeseBurgerCola(String name) {
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
        System.out.println("콜라를 마십니다.");
    }

    @Override
    public void empty() {
        System.out.println("콜라를 다 마셨습니다.");
    }
}
