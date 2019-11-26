package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q165CompareVersionNumbersTest {

    @Test
    public void compareVersion() {
        assertEquals(-1, Q165CompareVersionNumbers.compareVersion("0.1", "1.1"));
        assertEquals(1, Q165CompareVersionNumbers.compareVersion("1.0.1", "1"));
        assertEquals(-1, Q165CompareVersionNumbers.compareVersion("7.5.2.4", "7.5.3"));
        assertEquals(0, Q165CompareVersionNumbers.compareVersion("1.01", "1.001"));
        assertEquals(0, Q165CompareVersionNumbers.compareVersion("1.0", "1.0.0"));
    }
}