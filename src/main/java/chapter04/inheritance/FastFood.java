package chapter04.inheritance;

public abstract class FastFood implements Eatable {
    private String name;

    public FastFood(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
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

    abstract public boolean isDoublePatty();

    abstract public void drink();

    abstract public void empty();
}
