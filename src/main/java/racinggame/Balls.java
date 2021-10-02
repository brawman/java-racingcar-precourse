package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Balls {
	private final List<Ball> balls;

	public Balls(List<Integer> numbers) {
		if(numbers.size() != 3) {
			throw new IllegalArgumentException("숫자의 갯수가 3이 아닙니다.");
		}
		ArrayList<Ball> balls = new ArrayList<>();
		for (Integer number : numbers) {
			balls.add(new Ball(number));
		}
		this.balls = balls;
	}
}
