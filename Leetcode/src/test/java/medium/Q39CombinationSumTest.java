package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Q39CombinationSumTest {

    @Test
    public void combinationSum() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(7));
        expected1.add(Arrays.asList(2, 2, 3));

        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(2, 2, 2, 2));
        expected2.add(Arrays.asList(2, 3, 3));
        expected2.add(Arrays.asList(3, 5));

        List<List<Integer>> actual1 = Q39CombinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        List<List<Integer>> actual2 = Q39CombinationSum.combinationSum(new int[]{2, 3, 5}, 8);

        assertEquals(actual1.size(), expected1.size());
        assertEquals(actual2.size(), expected2.size());
        assertThat(actual1, containsInAnyOrder(expected1.toArray()));
        assertThat(actual2, containsInAnyOrder(expected2.toArray()));
    }
}