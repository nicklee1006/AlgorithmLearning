package w2_stack;

public class LinkedListImpl implements StackOfStrings {
    private Node first = null;

    @Override
    public void push(String item) {
        Node oldFirst = first;

        first = new Node();
        first.item = item;
        first = oldFirst;
    }

    @Override
    public String pop() {
        String item = first.item;

        first = first.next;

        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {
        String item;
        Node next;
    }
}
