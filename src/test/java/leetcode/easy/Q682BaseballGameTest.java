package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q682BaseballGameTest {

    @Test
    public void calPoints() {
        Assert.assertEquals(30, Q682BaseballGame.calPoints(new String[]{"5","2","C","D","+"}));
        Assert.assertEquals(27, Q682BaseballGame.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));

    }
}