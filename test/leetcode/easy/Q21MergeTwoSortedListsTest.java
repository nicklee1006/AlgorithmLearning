package leetcode.easy;

import org.junit.Test;

public class Q21MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        leetcode.util.ListNode node1 = new leetcode.util.ListNode(1);
        leetcode.util.ListNode node2 = new leetcode.util.ListNode(2);
        leetcode.util.ListNode node3 = new leetcode.util.ListNode(4);
        leetcode.util.ListNode node4 = new leetcode.util.ListNode(1);
        leetcode.util.ListNode node5 = new leetcode.util.ListNode(3);
        leetcode.util.ListNode node6 = new leetcode.util.ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;

        leetcode.util.ListNode result = Q21MergeTwoSortedLists.mergeTwoLists(node1, node4);

        while (result.next != null) {
            System.out.println(result.val);

            result = result.next;
        }

        System.out.println(result.val);
    }
}