package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q90SubsetsIITest {

    @Test
    public void subsetsWithDup() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(2));
        expected1.add(Arrays.asList(1));
        expected1.add(Arrays.asList(1, 2, 2));
        expected1.add(Arrays.asList(2, 2));
        expected1.add(Arrays.asList(1, 2));
        expected1.add(new ArrayList<>());

        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(1));
        expected2.add(Arrays.asList(1, 4));
        expected2.add(Arrays.asList(1, 4, 4));
        expected2.add(Arrays.asList(1, 4, 4, 4));
        expected2.add(Arrays.asList(1, 4, 4, 4, 4));
        expected2.add(Arrays.asList(4));
        expected2.add(Arrays.asList(4, 4));
        expected2.add(Arrays.asList(4, 4, 4));
        expected2.add(Arrays.asList(4, 4, 4, 4));
        expected2.add(new ArrayList<>());

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(Q90SubsetsII.subsetsWithDup(new int[]{1, 2, 2}), expected1));
        assertTrue(util.isTwoListOfListEqual(Q90SubsetsII.subsetsWithDup(new int[]{4,4,4,1,4}), expected2));
    }
}