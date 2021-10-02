package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {

	@Test
	@DisplayName("숫자의 범위는 1 ~ 9")
	void numberScope() {
		assertThatThrownBy(() -> new Ball(0)).isExactlyInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> new Ball(10)).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
