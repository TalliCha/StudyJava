package study_02.dao;

import java.util.List;
import java.util.Map;

import study_02.vo.AnalysisVo;
import study_02.vo.LottoVo;

public interface LottoDao {
	public int insert(List<LottoVo> lottoList);

	public int delete();

	public Map<Integer, LottoVo> select();

	public AnalysisVo analysis();
}
