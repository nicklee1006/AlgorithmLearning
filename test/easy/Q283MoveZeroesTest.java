package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q283MoveZeroesTest {

    @Test
    public void moveZeroes() {
        int[] test = {0, 1, 0, 3, 12};
        Q283MoveZeroes.moveZeroes(test);

        System.out.println(Arrays.toString(test));
    }
}