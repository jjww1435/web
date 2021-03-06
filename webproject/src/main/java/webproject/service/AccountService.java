package webproject.service;

import java.util.List;

import webproject.model.Account;

public interface AccountService {

	/**
	 * 查出所有Account用以展示页面
	 * @return
	 */
	List<Account> listservice();

	/**
	 * 根据id查询出account
	 * @param id
	 * @return
	 */
	Account selectservice(Integer id);

	// List<Account> selectListByIds()

	/**
	 * 新增Account
	 * @param account
	 */
	void insertAccount(Account account);

	/**
	 * 更新Account
	 * @param account
	 */
	void updateAccount(Account account);

	/**
	 * 根据Account id 删除对应Account
	 * @param id
	 */
	void deleteAccount(Integer id);
}
