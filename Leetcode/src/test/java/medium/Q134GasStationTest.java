package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q134GasStationTest {

    @Test
    public void canCompleteCircuit() {
        assertEquals(3, Q134GasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        assertEquals(-1, Q134GasStation.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3,4,3}));
    }
}