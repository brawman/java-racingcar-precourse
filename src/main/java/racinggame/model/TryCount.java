package racinggame.model;

public class TryCount {
	public static final String ILVALID_TRY_COUNT = "횟수가 0보다 작을 수 없습니다.";
	public static final String EMPTY_TRY_COUNT = "모든 횟수를 소모했습니다.";
	private int tryCount;

	public TryCount(int tryCount) {
		validate(tryCount);
		this.tryCount = tryCount;
	}

	private void validate(int tryCount) {
		if (tryCount < 0) {
			throw new IllegalArgumentException(ILVALID_TRY_COUNT);
		}
	}

	public boolean empty() {
		return this.tryCount == 0;
	}

	public void spend() {
		if (this.tryCount == 0) {
			throw new IllegalStateException(EMPTY_TRY_COUNT);
		}
		this.tryCount -= 1;
	}
}
