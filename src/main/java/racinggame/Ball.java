package racinggame;

public class Ball {
	private final int number;

	public Ball(int number) {
		if(number < 1 || number > 9) {
			throw new IllegalArgumentException(number + "가 1 ~ 9를 벗어났습니다.");
		}
		this.number = number;
	}
}
