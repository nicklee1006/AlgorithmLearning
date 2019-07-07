package princeton.w2_assignment2;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class DequeTest {
    private princeton.w2_assignment2.Deque<Integer> deque;

    @Before
    public void setUp() {
        deque = new princeton.w2_assignment2.Deque<>();
    }

    @Test(expected = NoSuchElementException.class)
    public void removeFirstFromEmpty() {
        deque.removeFirst();
    }

    @Test(expected = NoSuchElementException.class)
    public void removeLastFromEmpty() {
        deque.removeLast();
    }

    @Test
    public void fromNonEmptyToEmptyToNonEmpty() {
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);

        deque.removeLast();
        deque.removeLast();
        deque.removeLast();

        deque.addFirst(3);
        deque.addFirst(4);

        printDeque();
    }

    private void printDeque() {
        for (int i : deque) {
            StdOut.print(i + " ");
        }

        StdOut.print("\n");
    }
}