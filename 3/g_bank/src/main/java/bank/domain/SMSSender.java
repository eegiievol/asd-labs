package bank.domain;

public class SMSSender implements AccountObserver{

    @Override
    public void update(Account account) {
        System.out.println(account.getBalance());
    }
}