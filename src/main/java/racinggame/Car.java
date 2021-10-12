package racinggame;

import java.util.Objects;

public class Car implements Comparable<Car> {
	private final String name;
	private int distance;

	public Car(String name) {
		this(name, 0);
	}

	public Car(String name, int distance) {
		if (name.length() < 1 || name.length() > 5) {
			throw new IllegalArgumentException(name + "은 1 ~ 5 사이즈의 길이가 아닙니다.");
		}
		this.name = name;
		this.distance = distance;
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
