package study_02.dbconnector;

import study_02.service.LottoService;
import study_02.dao.LottoMysqlDao;
import study_02.dao.LottoOracleDao;

public class DBconnector {
	public static LottoService mysqlConn() {
		return new LottoService(new LottoMysqlDao());
	}

	public static LottoService oracleConn() {
		return new LottoService(new LottoOracleDao());
	}
}
