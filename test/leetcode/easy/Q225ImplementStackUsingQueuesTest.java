package leetcode.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q225ImplementStackUsingQueuesTest {
    private Q225ImplementStackUsingQueues stack;

    @Before
    public void setUp() throws Exception {
        stack = new Q225ImplementStackUsingQueues();
    }

    @Test
    public void push() {
        stack.push(1);
        stack.push(2);

        Assert.assertFalse(stack.empty());
    }

    @Test
    public void pop() {
        stack.push(1);
        stack.push(2);

        Assert.assertEquals(2, stack.pop());
    }

    @Test
    public void top() {
        stack.push(1);
        stack.push(2);

        Assert.assertEquals(2, stack.top());
    }

    @Test
    public void empty() {
        Assert.assertTrue(stack.empty());
    }
}