package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q551StudentAttendanceRecordITest {

    @Test
    public void checkRecord() {
        Assert.assertTrue(Q551StudentAttendanceRecordI.checkRecord("PPALLP"));
        Assert.assertFalse(Q551StudentAttendanceRecordI.checkRecord("PPALLL"));
    }
}