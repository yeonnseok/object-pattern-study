package chapter02.encapsulated;

public class encapsulatedPositionCar {
    private String name;
    private Position position;

    public encapsulatedPositionCar(String name) {
        this.name = name;
    }

    public void move(int number) {
        position.changeBy(number, name);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position.getPosition();
    }
}
