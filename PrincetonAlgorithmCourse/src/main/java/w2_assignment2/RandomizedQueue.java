package w2_assignment2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] randomQueue;    // array holding all elements
    private int size;           // size of the queue

    /**
     * construct an empty randomized queue.
     */
    public RandomizedQueue() {
        randomQueue = (Item[]) new Object[2];
        size = 0;
    }

    /**
     * is the randomized queue empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * return the number of items on the randomized queue.
     */
    public int size() {
        return size;
    }

    /**
     * add the item.
     */
    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        // double the size if full
        if (size == randomQueue.length) {
            resize(randomQueue.length * 2);
        }

        randomQueue[size] = item;
        size++;
    }

    /**
     * remove and return a random item.
     */
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        int randomIndex = StdRandom.uniform(size);

        final Item item = randomQueue[randomIndex];

        // replace the item with the last item in the queue if size > 1
        if (size > 1) {
            randomQueue[randomIndex] = randomQueue[size - 1];
        }

        randomQueue[size - 1] = null;
        size--;

        // shrink the array if too empty
        if (size == randomQueue.length / 4) {
            resize(randomQueue.length / 2);
        }

        return item;
    }

    /**
     * return a random item (but do not remove it).
     */
    public Item sample() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        int randomIndex = StdRandom.uniform(size);

        return randomQueue[randomIndex];
    }

    private void resize(int capacity) {
        if (capacity < 2) {
            return;
        }

        Item[] copy = (Item[]) new Object[capacity];

        if (size >= 0) {
            System.arraycopy(randomQueue, 0, copy, 0, size);
        }

        randomQueue = copy;
    }

    /**
     * return an independent iterator over items in random order.
     */
    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {
        private int index = 0;
        final private int[] randomIndex;

        public QueueIterator() {
            randomIndex = StdRandom.permutation(size);
        }

        @Override

        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Item item = randomQueue[randomIndex[index]];
            index++;

            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * unit testing (required).
     */
    public static void main(String[] args) {
        RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<>();

        randomizedQueue.enqueue(1);
        randomizedQueue.enqueue(2);
        randomizedQueue.enqueue(3);
        randomizedQueue.enqueue(4);
        randomizedQueue.enqueue(5);
        randomizedQueue.enqueue(6);

        StdOut.print("Sample: " + randomizedQueue.sample() + "\n");
        randomizedQueue.dequeue();
        randomizedQueue.dequeue();
        randomizedQueue.dequeue();
        randomizedQueue.dequeue();

        randomizedQueue.enqueue(12);
        randomizedQueue.enqueue(15);

        StdOut.print("Size: " + randomizedQueue.size() + "\n");
        StdOut.print("Is empty: " + randomizedQueue.isEmpty() + "\n");
        for (int i : randomizedQueue) {
            StdOut.print(i + " ");
        }

        StdOut.print("\n");
    }
}
