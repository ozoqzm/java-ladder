package ladder.domain;

public enum Direction {
    LEFT, RIGHT, NONE;

    private Direction() {
    }
    public static Direction fromBooleans(boolean left, boolean right) {
        if (left) {
            return LEFT;
        } else if (right) {
            return RIGHT;
        } else {
            return NONE;
        }
    }
}
