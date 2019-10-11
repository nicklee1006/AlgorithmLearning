package easy;

import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Q118PascalTriangleTest {

    @Test
    public void generate() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();

        assertTrue(util.isTwoListOfListEqual(expected, Q118PascalTriangle.generate(6)));
    }
}