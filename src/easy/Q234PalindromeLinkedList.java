package easy;

import util.ListNode;

/**
 * 2018.5.9 Question 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/description/
 *
 * Given a singly linked list, determine if it is a palindrome.
 */
public class Q234PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        // find middle point of the list, which is first
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        // reverse the second half
        first = reverse(first);
        second = head;

        while (second != null && first != null) {
            if (second.val != first.val) {
                return false;
            }

            second = second.next;
            first = first.next;
        }

        return true;
    }

    // reverse list, from a->b->c->null --> c->b->a->null
    private static ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }
}
