package study_01.lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LottoAnalysis {

	private Map<Integer, Integer> lottoAnalysis;
	private Map<Integer, Integer> sorted_lottoAnalysis;
	{
		lottoAnalysis = new HashMap<>();
		sorted_lottoAnalysis = new TreeMap<Integer, Integer>(new ValueCompare(lottoAnalysis));
	}

	public void add(ArrayList<Lotto> lottoList) {
		for (Lotto lotto : lottoList) {
			for (Integer num : lotto.lottoGame) {
				if (lottoAnalysis.containsKey(num)) {
					lottoAnalysis.put(num, lottoAnalysis.get(num) + 1);
				} else {
					lottoAnalysis.put(num, 1);
				}
			}
		}
	}

	public void print() {
//		System.out.println("######");
//		for (Integer num : lottoAnalysis.keySet()) {
//			System.out.printf(" %02d번 : %d회\n", num, lottoAnalysis.get(num));
//		}
		System.out.println("######");
		sorted_lottoAnalysis.putAll(lottoAnalysis);
		for (Integer num : sorted_lottoAnalysis.keySet()) {
			System.out.printf(" %02d번 : %d회\n", num, lottoAnalysis.get(num));
		}
	}

}
