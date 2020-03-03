package medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q228SummaryRangesTest {

    @Test
    public void summaryRanges() {
        String[] expected1 = {
                "0->2",
                "4->5",
                "7"
        };

        String[] expected2 = {
                "0",
                "2->4",
                "6",
                "8->9"
        };

        assertArrayEquals(expected1, Q228SummaryRanges.summaryRanges(new int[]{0,1,2,4,5,7}).toArray(new String[0]));
        assertArrayEquals(expected2, Q228SummaryRanges.summaryRanges(new int[]{0,2,3,4,6,8,9}).toArray(new String[0]));
    }
}