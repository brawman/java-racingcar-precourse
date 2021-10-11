package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	@DisplayName("자동차의 이름은 5자 이하")
	void carName() {
		assertThatThrownBy(() -> new Car("")).isExactlyInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> new Car("over6_")).isExactlyInstanceOf(IllegalArgumentException.class);
	}
}
