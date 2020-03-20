package chapter02.unencapsulated;

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

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
