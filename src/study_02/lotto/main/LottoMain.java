package study_02.lotto.main;

import study_02.lotto.dao.LottoDao;

public class LottoMain {
	public static void main(String[] args) {
		LottoDao.select(1,3,5);
		LottoDao.analysis(1,3);
	}
}
