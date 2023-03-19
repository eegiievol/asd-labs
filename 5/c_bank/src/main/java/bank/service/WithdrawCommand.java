package bank.service;

import bank.domain.Account;

public class WithdrawCommand implements Command {

    private double amount;
    private Account account;

    public WithdrawCommand(double amount, Account acc) {
        this.amount = amount;
        this.account = acc;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void unexecute() {
        account.deposit(amount);
    }
}
