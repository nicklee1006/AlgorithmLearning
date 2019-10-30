package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q131PalindromePartitioningTest {

    @Test
    public void partition() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("aa", "b"));
        expected.add(Arrays.asList("a", "a", "b"));

        ListOfListTestUtil<String> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(expected, Q131PalindromePartitioning.partition("aab")));
    }
}