package racinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	private List<Car> sortByReverseOrder(List<Car> cars) {
		List<Car> copyList = new ArrayList<>(cars);
		Collections.sort(copyList, Comparator.reverseOrder());
		return copyList;
	}

	public List<Car> winners() {
		List<Car> sortedCars = this.sortByReverseOrder(this.cars);
		Car winner = sortedCars.get(0);
		int index = 0;
		while (sortedCars.get(index) == winner) {
			index += 1;
		}
		List<Car> winners = sortedCars.subList(0, index + 1);
		return winners;
	}
}
