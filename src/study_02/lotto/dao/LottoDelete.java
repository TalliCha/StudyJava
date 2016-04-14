package study_02.lotto.dao;

class LottoDelete {
	public static void deleteLotto() {
		System.out.println("다지운다.");
	}

	public static void deleteLotto(int start, int end) {
		System.out.println(start+"-"+end+": 지운다.");
	}

	public static void deleteLotto(int... nums) {
		for (int i : nums) {
			System.out.print(i+",");
		}
		System.out.println(": 지운다.");
	}

	static void lotto(int... indexs) {
		switch (indexs.length) {
		case 0:
			deleteLotto();
			break;
		case 2:
			deleteLotto(indexs[0], indexs[1]);
			break;
		default:
			deleteLotto(indexs);
			break;
		}
	}
}
