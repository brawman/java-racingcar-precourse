package racinggame;

import java.util.List;

public class RacingGame {
	private final Cars cars;
	private int tryCount;

	public RacingGame(List<Car> cars, int tryCount) {
		this.cars = new Cars(cars);
		this.tryCount = tryCount;
	}

	private void decreaseTryCount() {
		this.tryCount -= 1;
	}

	public void play() {
		this.cars.play();
		this.decreaseTryCount();
	}

	public boolean isEnd() {
		return this.tryCount == 0;
	}

	public List<Car> gameWinners() {
		return this.cars.winners();
	}

	public List<Car> cars() {
		return this.cars.cars();
	}
}
