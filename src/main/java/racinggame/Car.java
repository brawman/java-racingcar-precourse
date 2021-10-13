package racinggame;

public class Car implements Comparable<Car> {
	private CarName name;
	private CarMileage mileage;

	public Car(String name) {
		this(name, 0);
	}

	public Car(String name, int mileage) {
		this.name = new CarName(name);
		this.mileage = new CarMileage(mileage);
	}

	public void move(MoveStrategy moveStrategy) {
		if (moveStrategy.isMovable()) {
			this.mileage.increase();
		}
	}

	public int distance() {
		return this.mileage.mileage();
	}

	@Override
	public int compareTo(Car other) {
		return this.mileage.compareTo(other.mileage);
	}

	@Override
	public String toString() {
		return name.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car)o;
		return this.mileage.equals(car.mileage);
	}

	@Override
	public int hashCode() {
		return this.mileage.hashCode();
	}
}
