package leetcode.medium;

import org.junit.Test;
import util.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class Q40CombinationSumIITest {

    @Test
    public void combinationSum2() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1, 7));
        expected1.add(Arrays.asList(1, 2, 5));
        expected1.add(Arrays.asList(2, 6));
        expected1.add(Arrays.asList(1, 1, 6));

        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(1, 2, 2));
        expected2.add(Arrays.asList(5));

        List<List<Integer>> actual1 = Q40CombinationSumII.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        List<List<Integer>> actual2 = Q40CombinationSumII.combinationSum2(new int[]{2,5,2,1,2}, 5);

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        assertEquals(expected1.size(), actual1.size());
        assertEquals(expected2.size(), actual2.size());
        assertTrue(util.isTwoListOfListEqual(actual1, expected1));
        assertTrue(util.isTwoListOfListEqual(actual2, expected2));
    }
}