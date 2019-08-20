package easy;

import org.junit.Test;

import java.util.List;

public class Q118PascalTriangleTest {

    @Test
    public void generate() {
        List<List<Integer>> results = Q118PascalTriangle.generate(6);

        for (List<Integer> temp : results) {
            for (int tempInt : temp) {
                System.out.print(tempInt + " ");
            }

            System.out.print("\n");
        }
    }
}