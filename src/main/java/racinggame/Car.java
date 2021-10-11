package racinggame;

public class Car {
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

	public void move() {
		this.distance += 1;
	}

	public int distance() {
		return this.distance;
	}

	public int compareDistance(Car other) {
		return Integer.compare(this.distance, other.distance);
	}
}
