package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallsTest {

	@Test
	@DisplayName("숫자는 3개로 이뤄져있다.")
	void numberCount() {
		assertThatThrownBy(() -> new Balls(Arrays.asList(1,2))).isExactlyInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> new Balls(Arrays.asList(1,2,3,4))).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
