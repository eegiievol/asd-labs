package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FilterIterator<Customer> implements Iterator<Customer> {

    private final List<Customer> list;
    private int position;
    private Predicate<Customer> predicate;
    public FilterIterator(List<Customer> list, Predicate<Customer> predicate) {
        this.list = list;
        this.predicate=predicate;
        this.position = 0;
    }
    public Iterator<Customer> iterator() { return this;
    }
    @Override
    public boolean hasNext() {
        int tempPosition = position;
        while (tempPosition < list.size()) {
            Customer nextElement = list.get(tempPosition); if (predicate.test(nextElement)) {
                return true;
            }
            else {
                tempPosition++;
            } }
        return false;
    }

    @Override
    public Customer next() {
        int tempPosition = position;
        while (tempPosition < list.size()) {
            Customer nextElement = list.get(tempPosition); if (predicate.test(nextElement)) {
                position=tempPosition+1;
                return nextElement;
            }
            else {
                tempPosition++;
            } }
        return null;
    }
}
