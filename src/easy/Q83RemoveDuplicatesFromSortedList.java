package easy;

import util.ListNode;

/**
 * 2018.4.3: Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * Solution
 * 1. Using node.next
 */
public class Q83RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode start = head;

        while (start.next != null) {
            if (start.next.val == start.val) {
                start.next = start.next.next;
            } else {
                start = start.next;
            }
        }

        return head;
    }
}
