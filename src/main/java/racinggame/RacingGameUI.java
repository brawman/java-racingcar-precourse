package racinggame;

import java.util.List;

import nextstep.utils.Console;

public class RacingGameUI {
	public static String carNames() {
		System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
		return Console.readLine();
	}

	public static String tryCount() {
		System.out.println("시도할회수는몇회인가요?");
		return Console.readLine();
	}

	public static void drawWinner(List<Car> gameWinners) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("최종 우승자는 ");
		buffer.append(gameWinners.get(0).toString());

		for (int i = 1; i < gameWinners.size(); i++) {
			buffer.append("," + gameWinners.get(i).toString());
		}
		buffer.append(" 입니다.");

		System.out.println(buffer);

	}

	public static void drawGame(List<Car> cars) {
		for (Car car : cars) {
			drawCar(car);
		}
		System.out.println();
	}

	private static void drawCar(Car car) {
		System.out.print(car.toString() + " : ");
		for (int i = 0; i < car.distance(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void drawGameResultMessage() {
		System.out.println("실행결과");
	}
}
