package study_02.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import study_02.vo.Lotto;

public class LottoMysqlDao implements LottoDao {

	private final String driver = "";
	private final String url = "";
	private final String user = "";
	private final String passwd = "";

	private Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, passwd);
	}

	@Override
	public int insert(List<Lotto> lottoList) {
		String sql = "";

		return sqlUpdate(sql);

	}

	@Override
	public int delete() {
		String sql = "";

		return sqlUpdate(sql);
	}

	@Override
	public List<Lotto> select() {
		String sql = "";

		return sqlSelectQuery(sql);
	}

	@Override
	public Map<Integer, Integer> analysis() {
		String sql = "";
		return analysisSqlQuery(sql);
	}

	private int sqlUpdate(String sql) {
		try (Connection conn = connect(); Statement stmt = conn.createStatement();) {
			return stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	private List<Lotto> sqlSelectQuery(String sql) {
		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			List<Lotto> list = new ArrayList<>();
			while (rs.next()) {
			}
			return list;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private Map<Integer, Integer> analysisSqlQuery(String sql) {
		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			HashMap<Integer, Integer> map = new HashMap<>();
			while (rs.next()) {

			}
			return map;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
