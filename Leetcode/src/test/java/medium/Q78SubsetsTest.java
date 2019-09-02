package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q78SubsetsTest {

    @Test
    public void subsets() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(3));
        expected1.add(Arrays.asList(1));
        expected1.add(Arrays.asList(2));
        expected1.add(Arrays.asList(1, 2, 3));
        expected1.add(Arrays.asList(1, 3));
        expected1.add(Arrays.asList(2, 3));
        expected1.add(Arrays.asList(1, 2));
        expected1.add(new ArrayList<>());

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(Q78Subsets.subsets(new int[]{1, 2, 3}), expected1));
    }
}