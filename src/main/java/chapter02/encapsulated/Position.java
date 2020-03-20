package chapter02.encapsulated;

public class Position {
    private int position;

    public void changeBy(int number, String name) {
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                position += 3;
            }
            position -= 1;
        }
        if (number == 5) {
            position = 20;
        }
        if (name.startsWith("a")) {
            position += 2;
        }
    }

    public int getPosition() {
        return position;
    }
}
