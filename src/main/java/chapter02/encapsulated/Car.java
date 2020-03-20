package chapter02.encapsulated;

public class Car {
    private String name;
    private int position;

    Car(String name) {
        this.name = name;
    }

    public void move(int number) {
        if (number >= 4) {
            position ++;
        }
    }

    public boolean isWinner() {
        return name.startsWith("p") && position > 20;
    }

    public String getName() {
        return name;
    }
}
