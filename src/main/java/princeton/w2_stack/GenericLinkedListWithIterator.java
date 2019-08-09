package princeton.w2_stack;

import java.util.Iterator;

public class GenericLinkedListWithIterator<E> implements Iterable {
    private Node first = null;

    public void push(E item) {
        Node oldFirst = first;

        first = new Node();
        first.item = item;
        first = oldFirst;
    }

    public E pop() {
        E item = first.item;

        first = first.next;

        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E item = current.item;
            current = current.next;

            return item;
        }
    }


    private class Node {
        E item;
        Node next;
    }
}
