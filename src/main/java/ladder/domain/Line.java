package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Point> points = new ArrayList<>(); // 해당 라인 좌표 리스트

    public Line(int personCount) {
        // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
        int size = personCount - 1;
        points = new ArrayList<>();
        boolean previousConnected = false; // 이전 좌표

        for (int i = 0; i < size; i++) {
            boolean currentConnected = createLine();
            if (previousConnected) {
                currentConnected = false; // 이전 좌표 연결된 경우 현재 좌표 연결X
            }
            points.add(new Point(previousConnected, currentConnected));
            previousConnected = currentConnected;
        }
        points.add(new Point(previousConnected, false)); // 다음을 위해
    }

    public List<Point> getPoints() {
        return points;
    }

    public boolean createLine() {
        int num = (int) (Math.random() * 2); // 0 또는 1 난수 생성
        return num == 1;
    }

    public void printLine() {
        StringBuilder builder = new StringBuilder();
        builder.append("|");
        for (Point point : points) {
            if (point.getRight()) // 좌표가 오른쪽과 연결이 될 경우
                builder.append("-----|");
            else
                builder.append("|");
        }
        System.out.println(builder.toString());
    }

}
