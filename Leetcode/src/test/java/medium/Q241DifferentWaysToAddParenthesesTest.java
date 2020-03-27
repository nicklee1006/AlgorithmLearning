package medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q241DifferentWaysToAddParenthesesTest {

    @Test
    public void diffWaysToCompute() {
        List<Integer> expected1 = Arrays.asList(2, 0);
        List<Integer> expected2 = Arrays.asList(-34, -10, -14, -10, 10);

        assertArrayEquals(expected1.toArray(), Q241DifferentWaysToAddParentheses.diffWaysToCompute("2-1-1").toArray(new Integer[0]));
        assertArrayEquals(expected2.toArray(), Q241DifferentWaysToAddParentheses.diffWaysToCompute("2*3-4*5").toArray(new Integer[0]));
    }
}