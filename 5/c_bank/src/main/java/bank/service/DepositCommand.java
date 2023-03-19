package bank.service;

import bank.domain.Account;

public class DepositCommand implements Command{

    private double amount;
    private Account account;

    public DepositCommand(double amount, Account acc) {
        this.amount = amount;
        this.account = acc;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void unexecute() {
        account.withdraw(amount);
    }
}
