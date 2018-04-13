package easy;

import util.ListNode;

/**
 * 2018.3.21
 * Question 21: Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
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
