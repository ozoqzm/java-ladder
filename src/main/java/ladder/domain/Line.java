package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private List<Point> points = new ArrayList<>(); // 해당 라인 좌표 리스트

    public Line(int personCount) {
        // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
        points = new ArrayList<>();
        boolean previousConnected = false; // 이전 좌표 false

        for (int i = 0; i < personCount; i++) {
            boolean currentConnected = createLine(); // 랜덤
            if (previousConnected) { // 이전 좌표 연결된 경우
                currentConnected = false;  // 현재 좌표 연결X
            }
            points.add(new Point(previousConnected, currentConnected));
            previousConnected = currentConnected;
        }
    }

    public List<Point> getPoints() {
        return points;
    }
    public Line(List<Point> points) {   // 테스트 위해 추가함!!
        this.points = points;
    }

    public boolean createLine() {
        Random random = new Random();
        boolean isConnected = random.nextBoolean();
        return isConnected;
    }

    public void printLine() {
        StringBuilder builder = new StringBuilder();
        builder.append("|"); // 처음
        for (Point point : points) {
            if (point.getRight()) // 좌표가 오른쪽과 연결이 될 경우
                builder.append("-----|");
            else
                builder.append("     |");
        }
        System.out.println(builder.toString());
    }

}
