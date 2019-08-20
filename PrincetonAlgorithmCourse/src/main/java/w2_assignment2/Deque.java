package w2_assignment2;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private Item[] deque;   // array to hold the elements
    private int size;       // size of the deque
    private int head;       // head index of the deque
    private int tail;       // tail index of the deque

    /**
     * construct an empty deque.
     */
    public Deque() {
        deque = (Item[]) new Object[2];
        size = 0;
        head = 0;
        tail = 0;
    }

    /**
     * is the deque empty.
     *
     * @return true if the deque is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * return the number of items on the deque.
     *
     * @return the number of items on the deque
     */
    public int size() {
        return size;
    }

    /**
     * add the item to the front.
     *
     * @param item item to add
     */
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        // if deque is full, double size
        if (size == deque.length) {
            resize(deque.length * 2);
        }

        if (isEmpty()) {
            deque[head] = item;
        } else {
            head--;

            // wrap-around
            if (head == -1) {
                head = deque.length - 1;
            }

            deque[head] = item;
        }

        size++;
    }

    /**
     * add the item to the back.
     *
     * @param item item to add
     */
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        // double the size if deque is full
        if (size == deque.length) {
            resize(deque.length * 2);
        }

        if (isEmpty()) {
            deque[tail] = item;
        } else {
            tail++;

            // wrap-around
            if (tail == deque.length) {
                tail = 0;
            }

            deque[tail] = item;
        }

        size++;
    }

    /**
     * remove and return the item from the front.
     *
     * @return item at the front
     */
    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        final Item item = deque[head];
        deque[head] = null;

        head++;
        size--;

        if (head == deque.length) {
            head = 0;
        }

        if (size == 0) {
            head = 0;
            tail = 0;
        }

        // shrink size
        if (size == deque.length / 4) {
            resize(deque.length / 2);
        }

        return item;
    }

    /**
     * remove and return the item from the back.
     *
     * @return item at the last
     */
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        final Item item = deque[tail];
        deque[tail] = null;

        tail--;
        size--;

        if (tail == -1) {
            if (size == 0) {
                head = 0;
                tail = 0;
            } else {
                tail = deque.length - 1;
            }
        }

        // shrink size
        if (size == deque.length / 4) {
            resize(deque.length / 2);
        }

        return item;
    }

    /**
     * resize the underlying array.
     *
     * @param capacity new capacity
     */
    private void resize(int capacity) {
        if (capacity < 2) {
            return;
        }

        Item[] copy = (Item[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            copy[i] = deque[(head + i) % deque.length];
        }

        deque = copy;
        head = 0;
        tail = size - 1;
    }

    /**
     * return an iterator over items in order from front to back.
     *
     * @return an iterator over items in order from front to back
     */
    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Item item = deque[(index + head) % deque.length];

            index++;

            return item;
        }
    }


    /**
     * unit testing (required).
     */
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();

        deque.isEmpty();
        deque.addLast(2);
        deque.removeFirst();
        deque.addLast(4);
        deque.addLast(5);
        deque.removeFirst();
        deque.removeFirst();
        deque.addLast(8);
        deque.removeFirst();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addFirst(4);

        deque.removeFirst();
        deque.removeLast();

        StdOut.print("Size: " + deque.size() + "\n");
        for (int i : deque) {
            StdOut.print(i + " ");
        }

        StdOut.print("\n");

        deque.addLast(5);
        deque.addFirst(10);
        deque.addLast(12);
        deque.addFirst(15);
        deque.addLast(22);

        deque.removeFirst();
        deque.removeLast();

        StdOut.print("Size: " + deque.size() + "\n");
        for (int i : deque) {
            StdOut.print(i + " ");
        }

        StdOut.print("\n");
    }
}
