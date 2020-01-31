package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q213HouseRobberIITest {

    @Test
    public void rob() {
        assertEquals(3, Q213HouseRobberII.rob(new int[]{2, 3, 2}));
        assertEquals(4, Q213HouseRobberII.rob(new int[]{1, 2, 3, 1}));
        assertEquals(1, Q213HouseRobberII.rob(new int[]{1}));
    }
}