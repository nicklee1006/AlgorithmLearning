package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q27RemoveElementTest {

    @Test
    public void removeElement() {
        int[] nums = {3,2,2,3,1,4};
        Assert.assertEquals(4, Q27RemoveElement.removeElement(nums,3));
    }
}