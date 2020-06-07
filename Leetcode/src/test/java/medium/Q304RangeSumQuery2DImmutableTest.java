package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q304RangeSumQuery2DImmutableTest {

    @Test
    public void sumRegion() {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        Q304RangeSumQuery2DImmutable obj = new Q304RangeSumQuery2DImmutable(matrix);

        assertEquals(8, obj.sumRegion(2, 1, 4, 3));
        assertEquals(11, obj.sumRegion(1, 1, 2, 2));
        assertEquals(12, obj.sumRegion(1, 2, 2, 4));
    }
}