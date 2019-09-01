package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q77CombinationsTest {

    @Test
    public void combine() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(2, 4));
        expected1.add(Arrays.asList(3, 4));
        expected1.add(Arrays.asList(2, 3));
        expected1.add(Arrays.asList(1, 2));
        expected1.add(Arrays.asList(1, 3));
        expected1.add(Arrays.asList(1, 4));

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(Q77Combinations.combine(4, 2), expected1));
    }
}