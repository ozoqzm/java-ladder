package ladder.domain;

public class Point {
    private boolean isConnected;

    public Point(boolean isConnected) {
        this.isConnected = isConnected;
    }

    public boolean isConnected() {
        return isConnected;
    }
}
