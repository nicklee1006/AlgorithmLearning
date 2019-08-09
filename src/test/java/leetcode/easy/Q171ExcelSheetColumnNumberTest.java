package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q171ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {
        Assert.assertEquals(26, Q171ExcelSheetColumnNumber.titleToNumber("Z"));
        Assert.assertEquals(28, Q171ExcelSheetColumnNumber.titleToNumber("AB"));

    }
}