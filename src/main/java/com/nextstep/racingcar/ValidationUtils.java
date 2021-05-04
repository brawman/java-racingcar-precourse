package com.nextstep.racingcar;

public class ValidationUtils {
	public final static int MAX_NUMBER = 9;
	public final static int MIN_NUMBER = 0;
	public final static int MAX_STRING_LENGTH = 5;
	public final static int MIN_STRING_LENGTH = 1;

	public static boolean validNumberScope(int number) {
		return number >= MIN_NUMBER && number <= MAX_NUMBER;
	}

	public static boolean validStringLength(String name) {
		int length = name.length();
		return length >= MIN_STRING_LENGTH && length <= MAX_STRING_LENGTH;
	}

}
