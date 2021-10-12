package racinggame;

public class MoveStrategy {
	private final int number;

	public MoveStrategy(int number) {
		this.number = number;
	}

	public boolean isMovable() {
		return this.number >= 4 && this.number <= 9;
	}
}
