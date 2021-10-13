package racinggame.model;

public class MoveStrategy {
	private final int number;

	public MoveStrategy(int number) {
		this.number = number;
	}

	public boolean isMovable() {
		return this.number >= RacingGameRule.MINIMUM_OF_MOVABLE_NUMBER
			&& this.number <= RacingGameRule.MAXIMUM_OF_MOVABLE_NUMBER;
	}
}
