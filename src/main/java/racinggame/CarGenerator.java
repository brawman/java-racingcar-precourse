package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {
	public static List<Car> generate(String names) {
		String[] carNames = names.split(",");
		ArrayList<Car> cars = new ArrayList<>();

		for (String carName : carNames) {
			cars.add(new Car(carName));
		}

		return cars;
	}
}
