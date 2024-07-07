package ladder;

import ladder.view.InputView;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
}
