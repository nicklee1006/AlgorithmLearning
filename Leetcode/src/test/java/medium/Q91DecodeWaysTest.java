package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q91DecodeWaysTest {

    @Test
    public void numDecodings() {
        assertEquals(2, Q91DecodeWays.numDecodings("12"));
        assertEquals(3, Q91DecodeWays.numDecodings("226"));
        assertEquals(0, Q91DecodeWays.numDecodings("0"));
        assertEquals(1, Q91DecodeWays.numDecodings("101"));
        assertEquals(0, Q91DecodeWays.numDecodings("00"));
        assertEquals(0, Q91DecodeWays.numDecodings("01"));
        assertEquals(0, Q91DecodeWays.numDecodings("230"));
        assertEquals(0, Q91DecodeWays.numDecodings("301"));

    }
}