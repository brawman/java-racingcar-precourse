package com.nextstep.racingcar;

public class Car implements Comparable<Car> {
	private CarName carName;
	private DrivingDistance drivingDistance;

	class CarName {
		String name;

		public CarName(String name) {
			if (!ValidationUtils.validStringLength(name)) {
				throw new IllegalArgumentException();
			}
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	class DrivingDistance {
		int distance;

		public DrivingDistance() {
			distance = 0;
		}

		public void increase() {
			distance += 1;
		}

		public int getValue() {
			return distance;
		}
	}

	public Car(String name) {
		carName = new CarName(name);
		drivingDistance = new DrivingDistance();
	}

	public String getName() {
		return carName.getName();
	}

	public void move() {
		drivingDistance.increase();
	}

	public int getDistance() {
		return drivingDistance.getValue();
	}

	@Override
	public int compareTo(Car car) {
		return this.getDistance() - car.getDistance();
	}

}
