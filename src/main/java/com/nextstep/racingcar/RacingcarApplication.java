package com.nextstep.racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RacingcarApplication {
	static final int MAX_RANDOM_NUMBER = 10;
	static final String CHAMPION_MESSAGE = "가 최종 우승했습니다.";
	static final String INTRO_RESULT_MESSAGE = "실행결과";
	private Random random;
	private RacingcarUI ui;

	public RacingcarApplication() {
		random = new Random();
		random.setSeed(System.currentTimeMillis());
		ui = new RacingcarUI();
	}

	public void start() {
		List<String> names = ui.getNames();
		int round = ui.getGameRound();
		CarGroup cars = new CarGroup(createCars(names));
		ui.drawResult(Arrays.asList(INTRO_RESULT_MESSAGE));
		for (int i = 0; i < round; i++) {
			processRound(cars);
			ui.drawResult(createRoundResult(cars));
		}
		ui.drawResult(createFinalResult(cars));
	}

	private List<String> createRoundResult(CarGroup cars) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < cars.size(); i++) {
			result.add(makeRoundResultFormat(cars.get(i)));
		}
		result.add("");
		return result;
	}

	private String makeRoundResultFormat(Car car) {
		String resultFormat = car.getName() + ":";
		for (int i = 0; i < car.getDistance(); i++) {
			resultFormat += "-";
		}
		return resultFormat;
	}

	private List<String> createFinalResult(CarGroup cars) {
		List<Car> champions = cars.getLongestDistanceCar();
		String resultFormat = "";
		for (Car someChampion : champions) {
			resultFormat += someChampion.getName() + ",";
		}
		resultFormat = resultFormat.substring(0, resultFormat.length() - 1);
		resultFormat += CHAMPION_MESSAGE;
		return Arrays.asList(resultFormat);
	}

	private void processRound(CarGroup cars) {
		for (int i = 0; i < cars.size(); i++) {
			CarController.excute(cars.get(i), makeRandomNumber());
		}
	}

	private int makeRandomNumber() {
		int num = random.nextInt(MAX_RANDOM_NUMBER);
		return num;
	}

	private List<Car> createCars(List<String> names) {
		ArrayList<Car> cars = new ArrayList<Car>();
		for (String name : names) {
			cars.add(new Car(name));
		}
		return cars;
	}

	public static void main(String args[]) {
		RacingcarApplication app = new RacingcarApplication();
		app.start();
	}
}
