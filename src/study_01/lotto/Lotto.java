package study_01.lotto;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	Set<Integer> lottoGame;

	{
		lottoGame = new TreeSet<>(); // 순서 정리
		
		while (lottoGame.size() < 6)
			lottoGame.add((int) (Math.random() * 45 + 1));
	}

	@Override
	public String toString() {
		return "Lotto=" + lottoGame;
	}

	/**
	 * 
	 * @param size
	 * @return ArrayList<Lotto> lottoList
	 */
	public static ArrayList<Lotto> makeLotto(int size) {
		ArrayList<Lotto> lottoList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			lottoList.add(new Lotto());
		}
		return lottoList;
	}

	public static void print(ArrayList<Lotto> lottoList) {
		int count = 0;
		for (Lotto lotto : lottoList) {
			System.out.printf("%02d : %s\n", ++count, lotto);
		}
	}

}