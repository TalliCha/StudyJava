package study_01.lotto;

import java.util.ArrayList;

public class LottoMain {
	public static void main(String[] args) {
		int round = 100; // 게임 횟수
		
		ArrayList<Lotto> lottoList = Lotto.makeLotto(round);

		Lotto.print(lottoList);
		
		LottoAnalysis analysis = new LottoAnalysis();
		
		analysis.add(lottoList);
		analysis.print();
		
		analysis.add(Lotto.makeLotto(round));
		analysis.print();

	}
}
