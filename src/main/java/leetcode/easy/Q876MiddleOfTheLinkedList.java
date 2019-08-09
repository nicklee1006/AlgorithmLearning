package leetcode.easy;

import leetcode.util.ListNode;

/**
 * 2018.10.15 Question 876: Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/description/
 *
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 */
public class Q876MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
