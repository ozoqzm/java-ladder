package ladder.view;

import ladder.domain.Ladder;
import ladder.domain.Line;

import java.util.List;

public class OutputView {
    public void printNames(List<String> names) {
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
    public void printLadder(Ladder ladder) {
        for (Line line : ladder.getLines()) {
            line.printLine();
            System.out.println();
        }
    }
    public void printResult(String resultKey, List<String> names, List<String> results, Ladder ladder) {
        // 전체 결과 출력
        if (resultKey.equals("all")) {
            for (int i = 0; i < names.size(); i++) {
                int finalPosition = ladder.play(i);
                System.out.println(names.get(i) + ": " + results.get(finalPosition));
            }
        }
        else {
            for (int i = 0; i < names.size(); i++) {
                if (resultKey.equals(names.get(i))) {
                    int finalPosition = ladder.play(i);
                    System.out.println(names.get(i) + ": " + results.get(finalPosition));
                    break;
                }
            }
        }
    }
}
