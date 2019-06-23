package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q883ProjectionAreaOf3DShapesTest {

    @Test
    public void projectionArea() {
        Assert.assertEquals(5, Q883ProjectionAreaOf3DShapes.projectionArea(new int[][]{new int[]{2}}));
        Assert.assertEquals(17, Q883ProjectionAreaOf3DShapes.projectionArea(new int[][]{new int[]{1,2}, new int[]{3,4}}));

    }
}