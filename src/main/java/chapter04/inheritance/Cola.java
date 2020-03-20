package chapter04.inheritance;

public class Cola extends FastFood{
    private int sugar;

    public Cola(String name) {
        super(name);
        this.sugar = 90;
    }

    public void setSugar(int targetSugar) {
        this.sugar = targetSugar;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public void drink() {
        System.out.println("코카콜라를 마십니다.");
    }

    @Override
    public void empty() {
        System.out.println("코카콜라를 다 마셨습니다.");
    }
}
