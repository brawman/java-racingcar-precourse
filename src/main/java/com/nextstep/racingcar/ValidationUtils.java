package com.nextstep.racingcar;

public class ValidationUtils {
	public final static int MAX_NUMBER = 9;
	public final static int MIN_NUMBER = 0;

	public static boolean validNumberScope(int number) {
		return number >= MIN_NUMBER && number <= MAX_NUMBER;
	}

}
