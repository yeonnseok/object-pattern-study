package chapter02.unencapsulated;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();

    public Car findWinner() {
        for (Car car : cars) {
            if (car.getName().startsWith("p") && car.getPosition() > 20) {
                return car;
            }
        }
        return null;
    }

    public void printWinnerName() {
        for (Car car : cars) {
            if (car.getName().startsWith("p") && car.getPosition() > 20) {
                System.out.println(car.getName());
            }
        }
    }
}
