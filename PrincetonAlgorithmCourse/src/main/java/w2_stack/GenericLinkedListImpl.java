package w2_stack;

public class GenericLinkedListImpl<E> {
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

    private class Node {
        E item;
        Node next;
    }
}
