package racinggame.model;

import nextstep.utils.Randoms;

public class RandomNumberGenerator implements NumberGenerator {
	@Override
	public int generate() {
		return Randoms.pickNumberInRange(RacingGameRule.MINIMUM_OF_GAME_NUMBER, RacingGameRule.MAXIMUM_OF_GAME_NUMBER);
	}
}
