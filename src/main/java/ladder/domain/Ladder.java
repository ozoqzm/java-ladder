package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> lines = new ArrayList<>();;

    public Ladder(int height, int personCount) {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(personCount));
        }
    }
    public List<Line> getLines() {
        return lines;
    }
    public int play(int startIndex, List<Line> lines) {
        int currentPosition = startIndex;

        for (Line line : lines) {
            List<Point> points = line.getPoints();
            Point currentPoint = points.get(currentPosition);

            if (currentPoint.nextDirection() == Direction.LEFT) {
                currentPosition--;
            } else if (currentPoint.nextDirection() == Direction.RIGHT) {
                currentPosition++;
            }
        }
        return currentPosition;
    }

}
