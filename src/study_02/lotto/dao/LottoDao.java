package study_02.lotto.dao;

public class LottoDao {

	public static void insert(Object object) {
		LottoInsert.lotto(object);
	}

	public static void delete(int... indexs) {
		LottoDelete.lotto(indexs);
	}

	public static void select(int... indexs) {
		LottoSelect.lotto(indexs);
	}
	
	public static void analysis(int... indexs) {
		LottoAnalysis.lotto(indexs);
	}
	
}
