package medium;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Q187RepeatedDNASequencesTest {

    @Test
    public void findRepeatedDnaSequences() {
        List<String> expected1 = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        List<String> expected2 = Collections.singletonList("AAAAAAAAAA");

        assertTrue(CollectionUtils.isEqualCollection(expected1, Q187RepeatedDNASequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")));
        assertTrue(CollectionUtils.isEqualCollection(expected2, Q187RepeatedDNASequences.findRepeatedDnaSequences("AAAAAAAAAAA")));
    }
}