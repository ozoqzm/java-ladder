package ladder.domain;

public class Point {
    private boolean left; // final? // 왼쪽이 연결되어있는지
    private boolean right; // 오른쪽이 연결되어있는지

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
