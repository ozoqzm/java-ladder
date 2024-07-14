package ladder.domain;

public enum Direction {
    LEFT, RIGHT, NONE;
    public static Direction of(boolean left, boolean right) {
        if (left) {
            return LEFT;
        }
        if (right) {
            return RIGHT;
        }
        return NONE;
    }
}
