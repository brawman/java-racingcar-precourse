package com.nextstep.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
	@Test
	@DisplayName("자동차 이름 5자리 테스트")
	void carNameLength() {
		String validName = "5자리이름";
		Car validCar = new Car(validName);
		assertThat(validCar.getName()).isEqualTo(validName);

		assertThatIllegalArgumentException().isThrownBy(() -> {
			String notValidName = "6자리이름!";
			Car notValidCar = new Car(notValidName);
		});
	}

	@Test
	@DisplayName("자동차 전진 테스트")
	void carMove() {
		Car car = new Car("test");

		car.move();
		assertThat(car.getDistance()).isEqualTo(1);

		car.move();
		car.move();
		assertThat(car.getDistance()).isEqualTo(3);
	}
	
	@Test
	@DisplayName("주행거리를 통한 자동차 비교")
	void carCompare() {
		Car carA = new Car("A");
		Car carB = new Car("B");
		
		carA.move();
		assertThat(carA.compareTo(carB)).isGreaterThan(0);
		
		carB.move();
		assertThat(carA.compareTo(carB)).isEqualTo(0);
		
		carB.move();
		assertThat(carA.compareTo(carB)).isLessThan(0);
	}
}
