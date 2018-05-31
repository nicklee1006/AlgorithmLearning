package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q463IslandPerimeterTest {

    @Test
    public void islandPerimeter() {
        int[][] testCase = {{0,1,0,0},{1,1,1,0}, {0,1,0,0}, {1,1,0,0}};

        Assert.assertEquals(16, Q463IslandPerimeter.islandPerimeter(testCase));
    }
}