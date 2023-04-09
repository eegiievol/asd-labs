package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;

public class LoggingProxy implements IAccountDAO{
    AccountDAO accountDAO;
	Logger logger = new Logger();

	public LoggingProxy(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public Account loadAccount(long customerId) {
		Account account = accountDAO.loadAccount(customerId);
		logger.log("getting account with id= " + customerId);
		return account;
	}

    public void saveAccount(Account account) {
        logger.log("saveAccount with id= " + account.getAccountnumber());
        accountDAO.saveAccount(account);
    }

    public void updateAccount(Account account) {
        logger.log("updateAccount with id= " + account.getAccountnumber());
        accountDAO.updateAccount(account);
    }

    public Collection<Account> getAccounts() {
        logger.log("getAccounts...");
        return accountDAO.getAccounts();
    }
}
