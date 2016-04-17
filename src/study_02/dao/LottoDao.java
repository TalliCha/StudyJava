package study_02.dao;

import java.util.List;
import java.util.Map;

import study_02.vo.Lotto;

public interface LottoDao {
	public int insert(List<Lotto> lottoList);

	public int delete();

	public List<Lotto> select();

	public Map<Integer, Integer> analysis();
}
