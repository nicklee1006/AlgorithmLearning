package easy;

import org.junit.Test;
import util.ListNode;

public class Q83RemoveDuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates() {
        util.ListNode node1 = new util.ListNode(1);
        util.ListNode node2 = new util.ListNode(1);
        util.ListNode node3 = new util.ListNode(2);
        util.ListNode node4 = new util.ListNode(3);
        util.ListNode node5 = new util.ListNode(3);
        util.ListNode node6 = new util.ListNode(4);

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