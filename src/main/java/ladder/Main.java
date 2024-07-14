package ladder;

import ladder.domain.Ladder;
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

        ov.printNames(names);
        ov.printLadder(ladder);

        String resultKey = iv.resultKey();
    }
}
