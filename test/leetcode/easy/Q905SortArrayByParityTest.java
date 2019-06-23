package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q905SortArrayByParityTest {

    @Test
    public void sortArrayByParity() {
        Assert.assertArrayEquals(new int[]{2,4,1,3}, Q905SortArrayByParity.sortArrayByParity(new int[]{3,1,2,4}));
    }
}