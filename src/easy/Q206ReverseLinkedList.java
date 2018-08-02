package easy;

import util.ListNode;

/**
 * Question 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * Reverse a singly linked list.
 *
 * Solution
 * 1. Exchange current.next and previous
 * 2. Move current = current.next
 */
public class Q206ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
