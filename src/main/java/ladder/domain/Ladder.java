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
}
