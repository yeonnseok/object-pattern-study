package chapter02.encapsulated;


import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();

    public Car findWinner2() {
        for (Car car : cars) {
            if (car.isWinner()) {
                return car;
            }
        }
        return null;
    }

    public void printWinnerName() {
        for (Car car : cars) {
            if (car.isWinner()) {
                System.out.println(car.getName());
            }
        }
    }
}
