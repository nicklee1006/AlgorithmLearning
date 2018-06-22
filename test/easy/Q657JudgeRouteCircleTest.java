package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q657JudgeRouteCircleTest {

    @Test
    public void judgeCircle() {
        Assert.assertTrue(Q657JudgeRouteCircle.judgeCircle("UD"));
        Assert.assertFalse(Q657JudgeRouteCircle.judgeCircle("LL"));

    }
}