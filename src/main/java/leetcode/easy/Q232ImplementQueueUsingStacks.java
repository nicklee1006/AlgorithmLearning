package leetcode.easy;

import java.util.Stack;

/**
 * 2018.5.8 Question 232. Implement Queue using Stacks
 * https://leetcode.com/problems/implement-queue-using-stacks/description/
 *
 * Implement the following operations of a queue using stacks.
 *
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Notes:
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from
 * top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate a stack by using
 * a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called
 * on an empty queue).
 *
 * Solution
 * 1. Use 2 stacks
 * 2. If pop or peek, retrieve from stack2
 * 3. If stack2 is not empty, stack2.peek
 */
public class Q232ImplementQueueUsingStacks {
    private Stack<Integer> stack;
    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public Q232ImplementQueueUsingStacks() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();

        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }

        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty();
    }
}
