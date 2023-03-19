package customers;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortedIterator implements Iterator<Customer> {
    private final List<Customer> list;
    private int position;

    public SortedIterator(List<Customer> list){
        Collections.sort(list, new CustomerComparator());
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Customer next() {
        return list.get(position++);
    }

}
