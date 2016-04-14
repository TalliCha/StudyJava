package study_02.lotto.main;

import study_02.lotto.dao.LottoDao;

// Lotto 번호를 생성한다. 만들고 DB에 저장된다. // 생성할 갯수 및 강제 번호 지정 기능
// DB로 부터 값을 가져온다. 숫자 분석한다. 지운다.
public class LottoMain {
	public static void main(String[] args) {
		LottoDao.select(1,3,5);
		LottoDao.analysis(1,3);
	}
}
