package study_02.vo;

import java.util.Set;
import java.util.TreeSet;

public final class Lotto {
	private Set<Integer> lotto;

	public Lotto() {
		lotto = new TreeSet<>();
	}

	public Set<Integer> getLotto() {
		return lotto;
	}

	public void setLotto(Set<Integer> lotto) {
		if (lotto.size() == 6) {
			this.lotto = lotto;
		} else {
			System.out.println("Lotto 갯수가 6개가 아닙니다.");
		}
	}

}