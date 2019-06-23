package leetcode.easy;

import org.junit.Test;
import leetcode.util.ListNode;

public class Q83RemoveDuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates() {
        leetcode.util.ListNode node1 = new leetcode.util.ListNode(1);
        leetcode.util.ListNode node2 = new leetcode.util.ListNode(1);
        leetcode.util.ListNode node3 = new leetcode.util.ListNode(2);
        leetcode.util.ListNode node4 = new leetcode.util.ListNode(3);
        leetcode.util.ListNode node5 = new leetcode.util.ListNode(3);
        leetcode.util.ListNode node6 = new leetcode.util.ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode result = Q83RemoveDuplicatesFromSortedList.deleteDuplicates(node1);

        while (result.next != null) {
            System.out.println(result.val);

            result = result.next;
        }

        System.out.println(result.val);
    }
}