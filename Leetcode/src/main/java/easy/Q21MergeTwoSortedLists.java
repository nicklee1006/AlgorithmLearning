package easy;

import util.ListNode;

/**
 * 2018.3.21 Question 21: Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing
 * together the nodes of the first two lists.
 *
 */
public class Q21MergeTwoSortedLists {
    /**
     * * Solution:
     *  1. check if l1 or l2 is empty
     *  2. while l1 and l2 are not null
     *     2.1 compare value of l1 and l2, give smaller value to new list
     *     2.2 move smaller value list to next node
     *  3. connect the list that is not empty to the end of new list
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        // dummy head
        ListNode dummyNode = new ListNode(0);
        ListNode node = dummyNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            node = node.next;
        }

        // add whatever left to the end of result list
        node.next = l1 == null ? l2 : l1;

        return dummyNode.next;
    }
}
