package leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q232ImplementQueueUsingStacksTest {
    private Q232ImplementQueueUsingStacks queue;

    @Before
    public void setUp() throws Exception {
        queue = new Q232ImplementQueueUsingStacks();
    }

    @Test
    public void push() {
        queue.push(1);
        queue.push(2);

        Assert.assertFalse(queue.empty());
    }

    @Test
    public void pop() {
        queue.push(1);
        queue.push(2);

        Assert.assertEquals(1, queue.pop());
    }

    @Test
    public void peek() {
        queue.push(1);
        queue.push(2);

        Assert.assertEquals(1, queue.peek());
    }

    @Test
    public void empty() {
        queue.push(1);
        queue.push(2);

        Assert.assertFalse(queue.empty());
    }
}