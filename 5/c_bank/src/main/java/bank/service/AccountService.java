package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	AccountHistory depoHist;
	AccountHistory withHist;

	public AccountService(){
		accountDAO=new AccountDAO();
		depoHist = new AccountHistory();
		withHist = new AccountHistory();

	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		DepositCommand depositCommand = new DepositCommand(amount, account);
		depositCommand.execute();
		depoHist.addCommand(depositCommand);
		accountDAO.updateAccount(account);
	}

	public void cancelDeposit(){
		depoHist.undo();
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		WithdrawCommand withdrawCommand = new WithdrawCommand(amount, account);
		withdrawCommand.execute();
		withHist.addCommand(withdrawCommand);
		accountDAO.updateAccount(account);
	}

	public void cancelWithdraw(){
		withHist.undo();
	}

	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
