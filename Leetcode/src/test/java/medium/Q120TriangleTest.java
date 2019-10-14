package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class Q120TriangleTest {

    @Test
    public void minimumTotal() {
        List<List<Integer>> input1 = new ArrayList<>();
        input1.add(new LinkedList<>(Arrays.asList(2)));
        input1.add(new LinkedList<>(Arrays.asList(3, 4)));
        input1.add(new LinkedList<>(Arrays.asList(6, 5, 7)));
        input1.add(new LinkedList<>(Arrays.asList(4, 1, 8, 3)));

        assertEquals(11, Q120Triangle.minimumTotal(input1));
    }
}