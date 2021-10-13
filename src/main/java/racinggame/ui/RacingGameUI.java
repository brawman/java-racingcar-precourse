package racinggame.ui;

import java.util.List;

import nextstep.utils.Console;
import racinggame.model.Car;

public class RacingGameUI {
	public static final String QUESTION_OF_CAR_NAMES = "경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)";
	public static final String QUESTION_OF_TRY_COUNT = "시도할회수는몇회인가요?";
	public static final String MESSAGE_OF_WINNER = "최종 우승자는 ";
	public static final String COMMA = ",";
	public static final String MESSAGE_OF_END = " 입니다.";
	public static final String MESSAGE_OF_RESULT = "실행결과";
	public static final String DISTANCE_ICON = "-";
	public static final String SEPARATOR = " : ";

	public static String carNames() {
		System.out.println(QUESTION_OF_CAR_NAMES);
		return Console.readLine();
	}

	public static String tryCount() {
		System.out.println(QUESTION_OF_TRY_COUNT);
		return Console.readLine();
	}

	public static void drawWinner(List<Car> gameWinners) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(MESSAGE_OF_WINNER);
		buffer.append(gameWinners.get(0).toString());

		for (int i = 1; i < gameWinners.size(); i++) {
			buffer.append(COMMA + gameWinners.get(i).toString());
		}
		buffer.append(MESSAGE_OF_END);

		System.out.println(buffer);
	}

	public static void drawGame(List<Car> cars) {
		for (Car car : cars) {
			drawCar(car);
		}
		System.out.println();
	}

	private static void drawCar(Car car) {
		System.out.print(car.toString() + SEPARATOR);
		for (int i = 0; i < car.distance(); i++) {
			System.out.print(DISTANCE_ICON);
		}
		System.out.println();
	}

	public static void drawGameResultMessage() {
		System.out.println(MESSAGE_OF_RESULT);
	}
}
