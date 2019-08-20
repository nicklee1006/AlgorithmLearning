package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q504Base7Test {

    @Test
    public void convertToBase7() {
        Assert.assertEquals("202", Q504Base7.convertToBase7(100));
        Assert.assertEquals("-10", Q504Base7.convertToBase7(-7));
    }
}