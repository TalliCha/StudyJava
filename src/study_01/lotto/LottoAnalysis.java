package study_01.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LottoAnalysis {

	private LottoAnalysis() {
	}

	public static void analysis(Lotto lotto) {

		Map<Integer, Integer> resCount = Counting(lotto);
		List<Integer> sortedKey = sortKeyByValue(resCount);
		
		print(sortedKey, resCount);
	}

	/**
	 * lotto 에 저장된 같은 num의 갯수를 저장한 resCount를 반환
	 * @param lotto
	 * @return resCount
	 */
	private static Map<Integer, Integer> Counting(Lotto lotto) {
		Map<Integer, Integer> resCount = new HashMap<>();
		for (Set<Integer> lottoGame : lotto.getLottoList()) {
			for (Integer num : lottoGame) {
				if (resCount.containsKey(num)) {
					resCount.put(num, resCount.get(num) + 1); // count++
				} else {
					resCount.put(num, 1); // count 초기화
				}
			}
		}
		return resCount;
	}

	/**
	 * resCount의 value 기준으로 key 정렬후 sortedKey로 반환
	 * @param resCount
	 * @return sortedKey
	 */
	public static List<Integer> sortKeyByValue(final Map<Integer, Integer> resCount) {
		List<Integer> sortedKey = new ArrayList<>();
		sortedKey.addAll(resCount.keySet());

		Collections.sort(sortedKey, new Comparator<Integer>() {

			public int compare(Integer i1, Integer i2) {
				return ((Comparable<Integer>) resCount.get(i1)).compareTo(resCount.get(i2));
			}

		});
		Collections.reverse(sortedKey); // 내림차순으로 변환

		return sortedKey;
	}

	/**
	 * sortedKey 순서로 resCount 출력
	 * @param sortedKey
	 * @param lottoAnalysis
	 */
	private static void print(List<Integer> sortedKey, Map<Integer, Integer> lottoAnalysis) {
		System.out.println("###lotto 횟수 분석 결과###");

		for (Integer num : sortedKey) {
			System.out.println(num + " = " + lottoAnalysis.get(num));
		}
	}

}
