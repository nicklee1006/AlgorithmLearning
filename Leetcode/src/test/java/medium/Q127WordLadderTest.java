package medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q127WordLadderTest {

    @Test
    public void ladderLength() {
        assertEquals(5, Q127WordLadder.ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog")));
        assertEquals(0, Q127WordLadder.ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log")));
    }
}