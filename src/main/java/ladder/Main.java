package ladder;

import ladder.domain.Ladder;
import ladder.domain.Line;
import ladder.view.InputView;
import ladder.view.OutputView;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputView iv = new InputView();
        OutputView ov = new OutputView();

        List<String> names = iv.names();
        List<String> results = iv.results();
        int height = iv.height();

        Ladder ladder = new Ladder(height, names.size() - 1); // 세로 줄은 사용자 수 - 1
        List<Line> lines = ladder.getLines();
        ov.printNames(names);
        ov.printLadder(ladder);
        ov.printResults(results);

        String resultKey = iv.resultKey();
        ov.printResultDetail(resultKey, names, results, lines, ladder);
//        for (int i = 0; i < names.size(); i++) {
////            int finalPosition = ladder.play(i, lines);
//            System.out.println(names.get(i) + ": " + results.get(i));
//        }
    }
}
