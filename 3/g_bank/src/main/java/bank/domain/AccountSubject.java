package bank.domain;

import java.util.ArrayList;
import java.util.Collection;

public class AccountSubject {

    private Collection<AccountObserver> observers = new ArrayList<AccountObserver>();

    public void addObserver(AccountObserver observer){
        observers.add(observer);
    }
    public void removeObserver(AccountObserver observer){
        observers.remove(observer);
    }

    public void donotify(Account account){
        for (AccountObserver observer : observers){
            observer.update(account);
        }
    }
}
