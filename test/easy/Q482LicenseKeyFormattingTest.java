package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q482LicenseKeyFormattingTest {

    @Test
    public void licenseKeyFormatting() {
        Assert.assertEquals("5F3Z-2E9W", Q482LicenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        Assert.assertEquals("2-5G-3J", Q482LicenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
    }
}