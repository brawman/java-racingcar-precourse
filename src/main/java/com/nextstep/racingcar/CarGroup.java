package com.nextstep.racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarGroup {
	final List<Car> cars;

	public CarGroup(List<Car> list) {
		cars = list;
	}

	private int equalDistanceIndexOf(Car car, List<Car> cars) {
		int i = 0;
		while (cars.get(i).compareTo(car) != 0 && cars.size() > i) {
			i++;
		}
		return i;
	}

	public List<Car> getLongestDistanceCar() {
		ArrayList<Car> sortedCar = new ArrayList<Car>(cars);
		Collections.sort(sortedCar);
		int startIndex = equalDistanceIndexOf(sortedCar.get(sortedCar.size() - 1), sortedCar);
		return sortedCar.subList(startIndex, sortedCar.size());
	}

	public Car get(int i) {
		return cars.get(i);
	}

	public int size() {
		return cars.size();
	}

}
