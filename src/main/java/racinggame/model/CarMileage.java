package racinggame.model;

import java.util.Objects;

public class CarMileage implements Comparable<CarMileage> {
	public static final String INVALID_CAR_MILEAGE = "차의 이동거리는 0보다 작을 수 없습니다.";
	private int mileage;

	public CarMileage(int mileage) {
		if (mileage < 0) {
			throw new IllegalArgumentException(INVALID_CAR_MILEAGE);
		}
		this.mileage = mileage;
	}

	public void increase() {
		this.mileage += 1;
	}

	public int mileage() {
		return this.mileage;
	}

	@Override
	public int compareTo(CarMileage other) {
		return this.mileage - other.mileage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CarMileage that = (CarMileage)o;
		return mileage == that.mileage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mileage);
	}
}
