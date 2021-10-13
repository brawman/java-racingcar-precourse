package racinggame.model;

import java.util.List;

public class RacingGame {
	private final Cars cars;
	private TryCount tryCount;

	public RacingGame(List<Car> cars, int tryCount) {
		this.cars = new Cars(cars);
		this.tryCount = new TryCount(tryCount);
	}

	public void play() {
		this.cars.play();
		this.tryCount.spend();
	}

	public boolean isEnd() {
		return this.tryCount.empty();
	}

	public List<Car> gameWinners() {
		return this.cars.winners();
	}

	public List<Car> cars() {
		return this.cars.cars();
	}
}
