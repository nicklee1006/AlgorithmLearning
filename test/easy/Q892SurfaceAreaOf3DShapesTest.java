package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q892SurfaceAreaOf3DShapesTest {

    @Test
    public void surfaceArea() {
        Assert.assertEquals(10, Q892SurfaceAreaOf3DShapes.surfaceArea(new int[][]{new int[]{2}}));
        Assert.assertEquals(34, Q892SurfaceAreaOf3DShapes.surfaceArea(new int[][]{new int[]{1,2}, new int[]{3,4}}));
        Assert.assertEquals(16, Q892SurfaceAreaOf3DShapes.surfaceArea(new int[][]{new int[]{1,0}, new int[]{0,2}}));

    }
}