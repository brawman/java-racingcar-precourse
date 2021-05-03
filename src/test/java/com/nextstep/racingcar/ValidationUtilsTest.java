package com.nextstep.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {
	@Test
	@DisplayName("0~9 숫자 검증")
	void validation_check_number() {
		boolean result = ValidationUtils.validNumberScope(0);
		assertThat(result).isEqualTo(true);

		result = ValidationUtils.validNumberScope(9);
		assertThat(result).isEqualTo(true);

		result = ValidationUtils.validNumberScope(10);
		assertThat(result).isEqualTo(false);

		result = ValidationUtils.validNumberScope(-1);
		assertThat(result).isEqualTo(false);
	}

	@Test
	@DisplayName("5자 이하의 문자 검증")
	void validation_check_string() {
		boolean result = ValidationUtils.validStringLength("5자리이름");
		assertThat(result).isEqualTo(true);
		
		result = ValidationUtils.validStringLength("6자리이름!");
		assertThat(result).isEqualTo(false);
		
		result = ValidationUtils.validStringLength("쉿");
		assertThat(result).isEqualTo(true);
		
		result = ValidationUtils.validStringLength("");
		assertThat(result).isEqualTo(false);
	}
}
