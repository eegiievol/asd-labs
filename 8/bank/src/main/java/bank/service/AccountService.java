package bank.service;

import java.util.Collection;

import bank.domain.Account;

public class AccountService implements IAccountService {
	private AccountAdapter iAccountAdapter = new AccountAdapter();

	public Account createAccount(long accountNumber, String customerName) {
		return iAccountAdapter.createAccount(accountNumber, customerName);
	}
	public void deposit(long accountNumber, double amount) {
		iAccountAdapter.deposit(accountNumber, amount);
	}

	public Account getAccount(long accountNumber) {
		return iAccountAdapter.getAccount(accountNumber);
	}

	public Collection<Account> getAllAccounts() {
		return iAccountAdapter.getAllAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		iAccountAdapter.withdraw(accountNumber, amount);
	}

	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		iAccountAdapter.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
	}
}
