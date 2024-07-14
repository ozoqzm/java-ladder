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
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }
    public List<Line> getLines() {
        return lines;
    }

    public int play(int startIndex) {
        int currentPosition = startIndex; // 좌우

        for (Line line : lines) {
            List<Point> points = line.getPoints();
            Point currentPoint = points.get(currentPosition); // 해당 인덱스의 포인트 반환

            if (currentPoint.nextDirection() == Direction.LEFT)
                currentPosition--;
            else if (currentPoint.nextDirection() == Direction.RIGHT)
                currentPosition++;
            else
                break;
        }
        return currentPosition;
    }
}
