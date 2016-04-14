package study_02.lotto.dao;

class LottoAnalysis {
	public static void analysisByNumCount() {
		System.out.println("다 분석한다.");
	}

	public static void analysisByNumCount(int start, int end) {
		System.out.println(start+"-"+end+": 분석한다.");
	}

	public static void analysisByNumCount(int... nums) {
		for (int i : nums) {
			System.out.print(i+",");
		}
		System.out.println(": 분석한다.");
	}

	static void lotto(int... indexs) {
		switch (indexs.length) {
		case 0:
			analysisByNumCount();
			break;
		case 2:
			analysisByNumCount(indexs[0], indexs[1]);
			break;
		default:
			analysisByNumCount(indexs);
			break;
		}
	}
}
