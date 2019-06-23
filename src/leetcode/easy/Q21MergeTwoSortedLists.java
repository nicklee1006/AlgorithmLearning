package leetcode.easy;

import leetcode.util.ListNode;

/**
 * 2018.3.21 Question 21: Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing
 * together the nodes of the first two lists.
 *
 * Solution:
 * 1. check if l1 or l2 is empty
 * 2. while l1 and l2 are not null
 *  2.1 compare value of l1 and l2, give smaller value to new list
 *  2.2 move smaller value list to next node
 * 3. connect the list that is not empty to the end of new list
 */
public class Q21MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode result = new ListNode(0);
        ListNode head = result;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }

        if (l1 == null) {
            head.next = l2;
        }
        if (l2 == null) {
            head.next = l1;
        }

        return result.next;
    }
}
