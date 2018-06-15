package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q594LongestHarmoniousSubsequenceTest {

    @Test
    public void findLHS() {
        Assert.assertEquals(5, Q594LongestHarmoniousSubsequence.findLHS(new int[]{1,3,2,2,5,2,3,7}));
    }
}