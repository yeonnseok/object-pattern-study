package chapter02.encapsulated;

public class Position {
    private static final int BOOSTER_INCREASE = 3;
    private static final int REVERSE_DECREASE = 1;
    private static final int JUMP_ZONE_POSITION = 20;
    private static final int NAME_START_WITH_INCREASE = 2;
    private static final String NAME_STARTS_WITH_CHARACTER = "a";
    private static final int JUMP_ZONE_CONDITION_NUMBER = 5;
    private static final int REVERSE_CONDITION_NUMBER = 3;
    private static final int BOOSTER_CONDITION_NUMBER = 6;
    private int position;

    public void changeBy(int number, String name) {
        if (isBooster(number)) {
            position += BOOSTER_INCREASE;
        }
        if (isReverse()) {
            position -= REVERSE_DECREASE;
        }
        if (isJumpZone(number)) {
            position = JUMP_ZONE_POSITION;
        }
        if (isStartWithConditionIn(name)) {
            position += NAME_START_WITH_INCREASE;
        }
    }

    private boolean isStartWithConditionIn(String name) {
        return name.startsWith(NAME_STARTS_WITH_CHARACTER);
    }

    private boolean isJumpZone(int number) {
        return number == JUMP_ZONE_CONDITION_NUMBER;
    }

    private boolean isReverse() {
        return position % REVERSE_CONDITION_NUMBER == 0;
    }

    private boolean isBooster(int number) {
        return number % BOOSTER_CONDITION_NUMBER == 0;
    }

    public int getPosition() {
        return position;
    }
}
