package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Q119PascalTriangleIITest {

    @Test
    public void getRow() {
        List<Integer> result = Q119PascalTriangleII.getRow(3);
        Assert.assertArrayEquals(new int[]{1,3,3,1}, result.stream().mapToInt(Integer::intValue).toArray());
    }
}