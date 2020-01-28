package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q210CourseScheduleIITest {
    @Test
    public void findOrder() {
        assertArrayEquals(new int[]{0, 1}, Q210CourseScheduleII.findOrder(2, new int[][]{{1, 0}}));
        assertArrayEquals(new int[]{0, 1, 2, 3}, Q210CourseScheduleII.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }
}