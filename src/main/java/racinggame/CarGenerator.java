package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {
	public static final String REGEX = ",";

	public static List<Car> generate(String names) {
		String[] carNames = names.split(REGEX);
		ArrayList<Car> cars = new ArrayList<>();
		for (String carName : carNames) {
			cars.add(new Car(carName));
		}
		return cars;
	}
}
