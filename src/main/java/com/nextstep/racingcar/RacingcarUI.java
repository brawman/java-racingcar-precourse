package com.nextstep.racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RacingcarUI {
	static final String INTRO_MESSAGE_FOR_GET_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(),기준으로 구분)";
	static final String INTRO_MESSAGE_FOR_GET_ROUND_COUNT = "시도할 회수는 몇회인가요?";

	private Scanner sc;

	public RacingcarUI() {
		sc = new Scanner(System.in);
	}

	private List<String> nameTokenizer(String names) {
		return Arrays.asList(names.split(","));
	}

	public List<String> getNames() {
		System.out.println(INTRO_MESSAGE_FOR_GET_CAR_NAME);
		String answer = sc.next();
		return nameTokenizer(answer);
	}

	public int getGameRound() {
		System.out.println(INTRO_MESSAGE_FOR_GET_ROUND_COUNT);
		int answer = sc.nextInt();
		return answer;
	}

	public void drawResult(List<String> output) {
		for(String str : output) {
			System.out.println(str);
		}
	}

}
