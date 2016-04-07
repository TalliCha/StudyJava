package study_01.lotto;

import java.util.Comparator;
import java.util.Map;

public class ValueCompare implements Comparator<Integer> {

	private Map<Integer, Integer> compareValue;

	public ValueCompare(Map<Integer, Integer> compareValue) {
		this.compareValue = compareValue;
	}

	@Override
	public int compare(Integer key1, Integer key2) {
		if (compareValue.get(key1) < compareValue.get(key2)) {
			return 1;
		} else {
			return -1;
		}
	}

}
