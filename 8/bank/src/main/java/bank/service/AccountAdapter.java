package bank.service;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;

import java.util.Collection;

public class AccountAdapter implements IAccountAdapter {
    private IAccountDAO accountDAO = new AccountDAO();
    private LoggingProxy loggerProxy = new LoggingProxy((AccountDAO) accountDAO);
    private StopWatchProxy stopWatchProxy = new StopWatchProxy(loggerProxy);

    @Override
    public Account createAccount(long accountNumber, String customerName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);
        account.setCustomer(customer);
        stopWatchProxy.saveAccount(account);
        return account;
    }

    @Override
    public Account getAccount(long accountNumber) {
        Account account = stopWatchProxy.loadAccount(accountNumber);
        return account;
    }

    @Override
    public Collection<Account> getAllAccounts() {

        return stopWatchProxy.getAccounts();
    }

    @Override
    public void deposit(long accountNumber, double amount) {
        Account account = stopWatchProxy.loadAccount(accountNumber);
        account.deposit(amount);
        stopWatchProxy.updateAccount(account);
    }

    @Override
    public void withdraw(long accountNumber, double amount) {
        Account account = stopWatchProxy.loadAccount(accountNumber);
        account.withdraw(amount);
        stopWatchProxy.updateAccount(account);
    }

    @Override
    public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
        Account fromAccount = stopWatchProxy.loadAccount(fromAccountNumber);
        Account toAccount = stopWatchProxy.loadAccount(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount, description);
        stopWatchProxy.updateAccount(fromAccount);
        stopWatchProxy.updateAccount(toAccount);
    }
}
