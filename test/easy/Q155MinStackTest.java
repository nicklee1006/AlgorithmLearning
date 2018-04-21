package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q155MinStackTest {
    Q155MinStack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Q155MinStack();

        stack.push(1);
        stack.push(-1);
        stack.push(3);
    }

    @Test
    public void push() {
        stack.push(5);

        Assert.assertEquals(5, stack.top());
    }

    @Test
    public void pop() {
        stack.push(-5);

        stack.pop();

        Assert.assertEquals(-1, stack.getMin());
    }

    @Test
    public void top() {
        Assert.assertEquals(3, stack.top());
    }

    @Test
    public void getMin() {
        Assert.assertEquals(-1, stack.getMin());
    }
}