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
}
