package leetcode.easy;

import leetcode.util.ListNode;

/**
 * 2018.4.20: 141. Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/description/
 *
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 *
 * Solution:
 * 1. Detecting a Loop in Singly Linked List - Tortoise & Hare
 * http://codingfreak.blogspot.com/2012/09/detecting-loop-in-singly-linked-list_22.html
 * 2. Use 2 pointers, one fast (move 2-step each time), and one slow (move 1-step each time)
 * 3. If there is a cycle, then 2 pointers will meet at some point.
 * 4. If no cycle, then the fast one will reach end of the list
 */
public class Q141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            if (fast == null) {
                return false;
            }

            fast = fast.next;

            if (fast == null) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
    }
}
