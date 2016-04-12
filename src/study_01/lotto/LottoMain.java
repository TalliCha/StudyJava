package study_01.lotto;

public class LottoMain {
	public static void main(String[] args) {
		int round = 10; // 게임 횟수
		Lotto lotto = Lotto.makeLotto(round);

		lotto.add(round);

		lotto.printAll();

		LottoAnalysis.analysis(lotto);
	}
}
