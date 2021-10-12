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

	@Test
	@DisplayName("자동차 전진")
	void carMove() {
		Car car = new Car("test");
		car.move();
		assertThat(car.distance()).isEqualTo(1);
	}

	@Test
	@DisplayName("이동 거리 비교")
	void compareDistance() {
		Car car1 = new Car("test1", 5);
		Car car2 = new Car("test2", 3);

		assertThat(car1.compareTo(car2)).isGreaterThan(1);

		Car car3 = new Car("test3", 8);

		assertThat(car1.compareTo(car3)).isLessThan(-1);

		Car car4 = new Car("test4", 5);

		assertThat(car1.compareTo(car4)).isEqualTo(0);
	}
}
