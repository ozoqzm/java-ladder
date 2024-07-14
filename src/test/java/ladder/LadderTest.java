package ladder;

import ladder.view.InputView;
import ladder.domain.Line;
import ladder.domain.Point;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class LadderTest {
    @Test
    void testNameLength() {
        // Given
        String input = "abcdefgh,bbb,ccc";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        InputView inputView = new InputView();

        Throwable thrown = catchThrowable(() -> {
            inputView.names();
        });

        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자 이하여야 합니다.");
    }
    @Test
    void printLineTest() {
        PrintStream originalOut = System.out; // 기존 표준 출력 저장
        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // 출력 결과 저장 위해...
        System.setOut(new PrintStream(outContent));

        Line line = new Line(Arrays.asList(
                new Point(false, true),  // -----|
                new Point(true, false),  // |     |
                new Point(false, false)  // |     |
        ));
        line.printLine();

        String expectedOutput = "|-----|     |     |" + System.lineSeparator();
        assertThat(outContent.toString()).isEqualTo(expectedOutput);

        // 원래 표준 출력 복원
        System.setOut(originalOut);
    }
}
