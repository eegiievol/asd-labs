package bank.domain;

public class EmailSender implements AccountObserver{

    @Override
    public void update(Account account) {
        System.out.println(account.getBalance());
    }
}