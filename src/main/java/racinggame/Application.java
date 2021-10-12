package racinggame;

public class Application {
	public static void main(String[] args) {
		RacingGame game = null;
		do {
			game = createGame();
		} while (game == null);
		RacingGameUI.drawGameResultMessage();
		while (!game.isEnd()) {
			game.play();
			RacingGameUI.drawGame(game.cars());
		}
		RacingGameUI.drawWinner(game.gameWinners());
	}

	private static RacingGame createGame() {
		RacingGame game = null;
		try {
			game = new RacingGame(CarGenerator.generate(RacingGameUI.carNames()),
				Integer.parseInt(RacingGameUI.tryCount()));
		} catch (IllegalArgumentException exception) {
			System.out.println("[ERROR]" + exception.getMessage());
		}
		return game;
	}
}
