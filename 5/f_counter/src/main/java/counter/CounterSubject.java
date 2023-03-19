package counter;

import java.util.ArrayList;
import java.util.Collection;

public class CounterSubject {
    private Collection<CounterObserver> observers = new ArrayList<CounterObserver>();

    public void addObserver(CounterObserver observer){
        observers.add(observer);
    }
    public void removeObserver(CounterObserver observer){
        observers.remove(observer);
    }

    public void donotify(int counter){
        for (CounterObserver observer : observers){
            observer.update(counter);
        }
    }

}
