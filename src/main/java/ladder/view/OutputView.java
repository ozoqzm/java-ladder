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
}
