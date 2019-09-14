package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Q93RestoreIPAddressesTest {

    @Test
    public void restoreIpAddresses() {
        List<String> expected1 = new ArrayList<>();
        expected1.add("255.255.11.135");
        expected1.add("255.255.111.35");

        assertThat(Q93RestoreIPAddresses.restoreIpAddresses("25525511135"), is(expected1));
    }
}