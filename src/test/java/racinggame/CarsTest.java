package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racinggame.model.Car;
import racinggame.model.Cars;

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

	@Test
	@DisplayName("자동차 단체 이동 또는 정지")
	void carsMove() {
		Car pobi = new Car("pobi");
		Car crong = new Car("crong");
		Car honux = new Car("honux");
		Queue<Integer> numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(9);

		Cars cars = new Cars(() -> {
			return numbers.poll();
		}, Arrays.asList(pobi, crong, honux));

		cars.play();

		assertThat(pobi.distance()).isEqualTo(0);
		assertThat(crong.distance()).isEqualTo(1);
		assertThat(honux.distance()).isEqualTo(1);
	}
}
