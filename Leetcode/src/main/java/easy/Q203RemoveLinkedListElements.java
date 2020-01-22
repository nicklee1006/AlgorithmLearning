package easy;

import util.ListNode;

/**
 * 2018.5.2 Question 203. Remove Linked List Elements
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Solution
 * 1. Two pointers, current and previous
 */
public class Q203RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = head;
        ListNode previous = dummy;

        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
            } else {
                previous = current;
            }

            current = current.next;
        }

        return dummy.next;
    }
}
