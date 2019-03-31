package webproject.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import webproject.mapper.AccountMapper;
import webproject.model.Account;
import webproject.service.AccountService;

@Transactional
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountMapper accountMapper;

	public List<Account> listservice() {
		List<Account> list = accountMapper.selectAccountList();
		return list;
	}

	public Account selectservice(Integer id) {
		Account account = accountMapper.selectAccountById(id);
		return account;
	}

	public void insertAccount(Account account) {
		accountMapper.insertAccount(account);

	}

	public void updateAccount(Account account) {
		accountMapper.updateAccount(account);

	}

	public void deleteAccount(Integer id) {
		accountMapper.deleteAccountById(id);
	}

}
