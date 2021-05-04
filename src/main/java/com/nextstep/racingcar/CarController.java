package com.nextstep.racingcar;

public class CarController {
	public final static int MOVE_DECISION_VALUE = 3;

	private static boolean isMoveable(int number) {
		if (number > MOVE_DECISION_VALUE) {
			return true;
		}
		return false;
	}

	public static void excute(Car car, int number) {
		if (!ValidationUtils.validNumberScope(number)) {
			throw new IllegalArgumentException();
		}
		if (CarController.isMoveable(number)) {
			car.move();
		}
	}
}
