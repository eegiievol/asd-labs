package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;

public class StopWatchProxy implements IAccountDAO {
    LoggingProxy accountDAO;
    

	public StopWatchProxy(LoggingProxy accountDAO) {
		this.accountDAO = accountDAO;
	}


	public Account loadAccount(long customerId) {
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		Account account = accountDAO.loadAccount(customerId);
		stopwatch.stop();
		System.out.println("The method AccountDAO.loadAccount took " + stopwatch.getMillis() + " ms");
		return account;
	}

    public void saveAccount(Account account) {
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		accountDAO.saveAccount(account);
		stopwatch.stop();
		System.out.println("The method AccountDAO.loadAccount took " + stopwatch.getMillis() + " ms");
    }

    public void updateAccount(Account account) {
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		accountDAO.updateAccount(account);
		stopwatch.stop();
		System.out.println("The method AccountDAO.loadAccount took " + stopwatch.getMillis() + " ms");
    }

    public Collection<Account> getAccounts() {
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		Collection<Account> accounts =  accountDAO.getAccounts();
		stopwatch.stop();
		System.out.println("The method AccountDAO.loadAccount took " + stopwatch.getMillis() + " ms");
		return accounts;
    }
    
}
