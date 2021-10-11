package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarGeneratorTest {
	@Test
	@DisplayName("이름으로 자동차 생성")
	void makeCar() {
		List<Car> cars = CarGenerator.generate("pobi,crong,honux");

		assertThat(cars.size()).isEqualTo(3);
	}
}
