package easy;

import util.ListNode;

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
 * Detecting a Loop in Singly Linked List - Tortoise & Hare
 * http://codingfreak.blogspot.com/2012/09/detecting-loop-in-singly-linked-list_22.html
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
