package study_02.service;

import java.util.ArrayList;
import java.util.List;

import study_02.dao.LottoDao;
import study_02.vo.Lotto;

public class LottoService {

	LottoDao dao;

	public LottoService(LottoDao dao) {
		this.dao = dao;
	}

	public void setLottos(int round) {
		dao.insert(makeLottoList(round));
	}

	public List<Lotto> getLottos() {
		return dao.select();
	}

	public void deleteAll() {
		dao.delete();
	}

	public void analysis() {
		dao.analysis();
	}
	
	/*----------------------------------------------------------------*/	
	
	private List<Lotto> makeLottoList(int round) {

		List<Lotto> lottoList = new ArrayList<>();
		for (int i = 0; i < round; i++)
			lottoList.add(makeLotto());

		return lottoList;
	}

	private Lotto makeLotto() {
		Lotto lotto = new Lotto();

		while (lotto.getLotto().size() < 6)
			lotto.getLotto().add((int) (Math.random() * 45 + 1));

		return lotto;
	}

}
