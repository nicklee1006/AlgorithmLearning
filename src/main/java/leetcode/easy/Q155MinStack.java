package leetcode.easy;

import java.util.Stack;

/**
 * 2018.4.21 Question 155 Min Stack
 * https://leetcode.com/problems/min-stack/description/
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 * Solution
 * 1. Keep track min value
 * 2. If new value pushed is min, then push old min first, and update min
 * 3. If pop min, update min
 */
public class Q155MinStack {
    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack = new Stack<>();

    public Q155MinStack() {

    }

    public void push(int x) {
        // push the old min to stack. if new min get pop, the old min become the new min
        if (x <= min) {
            stack.push(min);
            min = x;
        }

        stack.push(x);
    }

    public void pop() {
        // remove min, set second min as new min (need to removed as well)
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
