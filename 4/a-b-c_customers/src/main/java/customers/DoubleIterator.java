package customers;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DoubleIterator implements Iterator<Customer> {

    private final List<Customer> list;
    private int position;

    public DoubleIterator(List<Customer> list){
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Customer next() {
        int pos = position;
        position += 2;
        return list.get(pos);
    }
}
