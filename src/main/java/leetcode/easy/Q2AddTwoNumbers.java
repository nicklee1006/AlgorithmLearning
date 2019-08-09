package leetcode.easy;

import leetcode.util.ListNode;
import java.math.BigDecimal;

/**
 * 2018.3.15 Question 2: Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored
 * in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a
 * linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * 1. traverse the linked list
 * 2. use StringBuilder.reverse to get the numbers
 * 3. add numbers
 * 4. convert to string, and reverse
 * 5. construct linked list
 */
public class Q2AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first1 = l1.val;
        int first2 = l2.val;

        String tempL1 = String.valueOf(first1);
        String tempL2 = String.valueOf(first2);

        while (l1.next != null) {
            tempL1 = tempL1 + String.valueOf(l1.next.val);

            l1 = l1.next;
        }

        while (l2.next != null) {
            tempL2 = tempL2 + String.valueOf(l2.next.val);

            l2 = l2.next;
        }

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        builder1.append(tempL1);
        builder2.append(tempL2);

        builder1 = builder1.reverse();
        builder2 = builder2.reverse();

        BigDecimal bd1 = new BigDecimal(builder1.toString());
        BigDecimal bd2 = new BigDecimal(builder2.toString());

        String answer = String.valueOf(bd1.add(bd2));

        StringBuilder builder3 = new StringBuilder();
        builder3.append(answer);

        builder3 = builder3.reverse();
        answer = builder3.toString();

        ListNode first = new ListNode(Character.getNumericValue(answer.charAt(0)));
        ListNode current = first;

        for (int i = 1; i < answer.length(); i++) {
            ListNode newNode = new ListNode(Character.getNumericValue(answer.charAt(i)));

            current.next = newNode;
            current = newNode;
        }

        return first;
    }
}
