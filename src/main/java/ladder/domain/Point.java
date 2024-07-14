package ladder.domain;

public class Point {
    private boolean left; // final?
    private boolean right;

    public Point(boolean left, boolean right) {
        this.left = left;
        this.right = right;
    }
    public boolean getLeft() {
        return left;
    }
    public boolean getRight() {
        return right;
    }

}
