package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q168ExcelSheetColumnTitleTest {

    @Test
    public void convertToTitle() {
        Assert.assertEquals("C", Q168ExcelSheetColumnTitle.convertToTitle(3));
        Assert.assertEquals("IF", Q168ExcelSheetColumnTitle.convertToTitle(165));
    }
}