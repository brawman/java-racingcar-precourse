package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	@DisplayName("우승자 찾기")
	void winner() {
		Car pobi = new Car("pobi", 3);
		Car crong = new Car("crong", 3);
		Car honux = new Car("honux", 1);
		Cars cars = new Cars(Arrays.asList(pobi, crong, honux));

		assertThat(cars.winners()).contains(pobi, crong);
	}
}
