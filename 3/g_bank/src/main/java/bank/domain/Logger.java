package bank.domain;

public class Logger implements AccountObserver{

    @Override
    public void update(Account account) {
        System.out.println(account.getBalance());
    }
}
