package medium;

import java.util.Iterator;

public class Q284PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> iterator;

    public Q284PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;

        if (this.iterator.hasNext()) {
            next = this.iterator.next();
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer result = next;

        next = iterator.hasNext() ? iterator.next() : null;

        return result;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}
