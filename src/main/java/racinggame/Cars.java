package racinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {
	private final List<Car> cars;
	private final NumberGenerator numberGenerator;

	public Cars(List<Car> cars) {
		this(new RandomNumberGenerator(), cars);
	}

	public Cars(NumberGenerator numberGenerator, List<Car> cars) {
		this.numberGenerator = numberGenerator;
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

	public void play() {
		for (Car car : this.cars) {
			car.move(new MoveStrategy(numberGenerator.generate()));
		}
	}
}
