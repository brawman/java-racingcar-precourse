package com.nextstep.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarControllerTest {
	@Test
	@DisplayName("3이하일때 멈추고 4이상일때 움직인다.")
	void carMoveCondition() {
		Car car = new Car("Test");

		CarController.excute(car, 3);
		assertThat(car.getDistance()).isEqualTo(0);

		CarController.excute(car, 4);
		assertThat(car.getDistance()).isEqualTo(1);
		
		CarController.excute(car, 9);
		assertThat(car.getDistance()).isEqualTo(2);
		
		CarController.excute(car, 0);
		assertThat(car.getDistance()).isEqualTo(2);
	}

}
