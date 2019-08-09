package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q33SearchInRotatedSortedArrayTest {

    @Test
    public void search() {
        Assert.assertEquals(4, Q33SearchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 0));
        Assert.assertEquals(-1, Q33SearchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}