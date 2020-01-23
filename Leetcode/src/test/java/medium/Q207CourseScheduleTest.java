package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q207CourseScheduleTest {

    @Test
    public void canFinish() {
        assertTrue(Q207CourseSchedule.canFinish(2, new int[][]{{1, 0}}));
        assertFalse(Q207CourseSchedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}