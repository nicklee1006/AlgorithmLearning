package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q216CombinationSumIIITest {

    @Test
    public void combinationSum3() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1, 2, 4));

        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(1, 2, 6));
        expected2.add(Arrays.asList(1, 3, 5));
        expected2.add(Arrays.asList(2, 3, 4));

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(Q216CombinationSumIII.combinationSum3(3, 7), expected1));
        assertTrue(util.isTwoListOfListEqual(Q216CombinationSumIII.combinationSum3(3, 9), expected2));
    }
}