package easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Q448FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void findDisappearedNumbers() {
        List<Integer> result = Q448FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});

        for (int temp : result) {
            System.out.println(temp);
        }
    }
}