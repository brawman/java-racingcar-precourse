package racinggame;

public class CarName {
	public static final String INVALID_NAME_LENGTH = "은 1 ~ 5 사이즈의 길이가 아닙니다.";
	private final String name;

	public CarName(String name) {
		validate(name);
		this.name = name;
	}

	private void validate(String name) {
		if (name.length() < RacingGameRule.MINIMUM_OF_NAME_LENGTH
			|| name.length() > RacingGameRule.MAXIMUM_OF_NAME_LENGTH) {
			throw new IllegalArgumentException(name + INVALID_NAME_LENGTH);
		}
	}

	@Override
	public String toString() {
		return name;
	}
}
