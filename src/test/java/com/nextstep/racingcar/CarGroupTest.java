package com.nextstep.racingcar;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarGroupTest {
	@Test
	@DisplayName("가장 긴 주행거리 찾기")
	void getLongestDrivingDistance() {
		Car carA = new Car("carA");
		carA.move();
		Car carB = new Car("carB");
		carB.move();
		carB.move();
		Car carC = new Car("carC");
		carC.move();
		carC.move();
		carC.move();
		Car carD = new Car("carD");
		carD.move();
		carD.move();
		carD.move();

		CarGroup carGroup = new CarGroup(Arrays.asList(carB, carA, carD, carC));

		assertThat(carGroup.getLongestDistanceCar()).size().isEqualTo(2);
		assertThat(carGroup.getLongestDistanceCar()).contains(carC, carD);
	}
}
