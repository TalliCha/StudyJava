package study_01.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	private Set<Integer> lottoGame;
	private List<Set<Integer>> lottoList;

	{
		lottoList = new ArrayList<>();
	}

	/**
	 * @param round
	 */
	private Lotto(int round) {
		this.add(round);
	}

	/**
	 * @return lottoGame
	 */
	private Set<Integer> setLottoGame() {
		lottoGame = new TreeSet<>(); // 순서 정리
		while (lottoGame.size() < 6)
			lottoGame.add((int) (Math.random() * 45 + 1));
		return lottoGame;
	}
	
	/**
	 * @return lottoList
	 */
	public List<Set<Integer>> getLottoList() {
		return lottoList;
	}

	/**
	 * @param round
	 * @return Lotto
	 */
	public static Lotto makeLotto(int round) {
		return new Lotto(round);
	}
	
	/**
	 * @param round
	 */
	public void add(int round) {
		for (int i = 0; i < round; i++) {
			this.lottoList.add(setLottoGame());
		}
	}

	public void printAll() {
		System.out.println("### lotto list ###");
		int count = 0;
		for (Set<Integer> lotto : this.lottoList) {
			System.out.printf("%02d : %s\n", ++count, lotto);
		}
	}

}