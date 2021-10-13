package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racinggame.model.Car;
import racinggame.model.MoveStrategy;

public class CarTest {
	@Test
	@DisplayName("자동차의 이름은 5자 이하")
	void carName() {
		assertThatThrownBy(() -> new Car("")).isExactlyInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> new Car("over6_")).isExactlyInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("4 ~ 9 사이 숫자에서 이동")
	void carMove() {
		Car car = new Car("test", 0);

		car.move(new MoveStrategy(4));
		assertThat(car.distance()).isEqualTo(1);

		car.move(new MoveStrategy(9));
		assertThat(car.distance()).isEqualTo(2);

		car.move(new MoveStrategy(3));
		assertThat(car.distance()).isEqualTo(2);

		car.move(new MoveStrategy(10));
		assertThat(car.distance()).isEqualTo(2);
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
