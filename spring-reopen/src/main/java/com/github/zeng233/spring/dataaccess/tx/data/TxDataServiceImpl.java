package com.github.zeng233.spring.dataaccess.tx.data;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/12 下午4:34
 */
public class TxDataServiceImpl implements ITxDataService {

	private TxDataDao txDataDao;

	public void save() {
		txDataDao.insert();
	}

	public void update(int id) {
		txDataDao.update(id);
	}

	public TxDataDao getTxDataDao() {
		return txDataDao;
	}

	public void setTxDataDao(TxDataDao txDataDao) {
		this.txDataDao = txDataDao;
	}
}
