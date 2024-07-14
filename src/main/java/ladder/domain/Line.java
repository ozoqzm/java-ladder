package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Point> points = new ArrayList<>(); // Boolean에 가로 막대기 값

    public Line(int personCount) {
        // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
        int size = personCount - 1;
        points = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            points.add(new Point(false));
        }
    }

    public boolean createLine() {
        int num = (int) (Math.random() * 2); // 0 또는 1 난수 생성
        return num == 1;
    }
}
