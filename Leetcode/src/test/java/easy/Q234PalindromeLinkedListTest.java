package easy;

import org.junit.Assert;
import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

public class Q234PalindromeLinkedListTest {

    @Test
    public void isPalindrome() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2});
        ListNode input2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 2, 1});

        Assert.assertTrue(Q234PalindromeLinkedList.isPalindrome(input1));
        Assert.assertFalse(Q234PalindromeLinkedList.isPalindrome(input2));
    }
}