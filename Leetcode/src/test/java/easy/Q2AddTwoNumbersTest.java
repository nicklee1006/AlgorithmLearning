package easy;

import org.junit.Assert;
import org.junit.Test;
import util.ListNode;
import testutil.LinkedListTestUtil;

public class Q2AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        ListNode testCase1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{9});
        ListNode testCase2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 1});

        assert testCase1 != null;
        assert testCase2 != null;
        ListNode actual = Q2AddTwoNumbers.addTwoNumbers(testCase1, testCase2);
        ListNode expected = LinkedListTestUtil.createLinkedListFromArray(new int[]{8, 0, 0, 0, 0, 0, 0, 0, 0, 2});

        Assert.assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(actual, expected));
    }
}