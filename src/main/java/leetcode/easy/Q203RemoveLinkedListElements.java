package leetcode.easy;

import leetcode.util.ListNode;

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
        ListNode pointer = head;
        ListNode previous = head;

        while (pointer != null) {
            if (pointer.val == val) {
                if (pointer == head) {
                    head = pointer.next;
                } else {
                    previous.next = pointer.next;
                }
            } else {
                previous = pointer;
            }

            pointer = pointer.next;
        }

        return head;
    }
}
