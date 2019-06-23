package leetcode.easy;

import org.junit.Test;
import leetcode.util.ListNode;

public class Q2AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(1);


        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;

        ListNode result = Q2AddTwoNumbers.addTwoNumbers(node1, node2);

        while (result.next != null) {
            System.out.println(result.val);

            result = result.next;
        }

        System.out.println(result.val);
    }
}