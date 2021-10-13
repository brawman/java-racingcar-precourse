package racinggame;

import java.util.Objects;

public class Car implements Comparable<Car> {
	public static final String INVALID_NAME_LENGTH = "은 1 ~ 5 사이즈의 길이가 아닙니다.";
	private final String name;
	private int distance;

	public Car(String name) {
		this(name, 0);
	}

	public Car(String name, int distance) {
		validate(name);
		this.name = name;
		this.distance = distance;
	}

	private void validate(String name) {
		if (name.length() < RacingGameRule.MINIMUM_OF_NAME_LENGTH
			|| name.length() > RacingGameRule.MAXIMUM_OF_NAME_LENGTH) {
			throw new IllegalArgumentException(name + INVALID_NAME_LENGTH);
		}
	}

	public void move(MoveStrategy moveStrategy) {
		if (moveStrategy.isMovable()) {
			this.distance += 1;
		}
	}

	public int distance() {
		return this.distance;
	}

	@Override
	public int compareTo(Car other) {
		return this.distance - other.distance;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car)o;
		return distance == car.distance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distance);
	}
}
