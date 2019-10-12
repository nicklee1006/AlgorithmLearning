package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Q119PascalTriangleIITest {

    @Test
    public void getRow() {
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);

        List<Integer> result = Q119PascalTriangleII.getRow(3);

        assertTrue(expected.size() == result.size() && expected.containsAll(result));
    }
}