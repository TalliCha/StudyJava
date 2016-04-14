package study_02.lotto.dao;

class LottoSelect {

	public static void selectLotto() {
		System.out.println("다 검색한다.");
	}

	public static void selectLotto(int start, int end) {
		System.out.println(start + "-" + end + ": 검색한다.");
	}

	public static void selectLotto(int... nums) {
		for (int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println(": 검색한다.");
	}

	static void lotto(int... indexs) {
		switch (indexs.length) {
		case 0:
			selectLotto();
			break;
		case 2:
			selectLotto(indexs[0], indexs[1]);
			break;
		default:
			selectLotto(indexs);
			break;
		}
	}
}
