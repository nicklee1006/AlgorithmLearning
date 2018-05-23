package easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Q412FizzBuzzTest {

    @Test
    public void fizzBuzz() {
        List<String> result = Q412FizzBuzz.fizzBuzz(15);

        for (String temp : result) {
            System.out.println(temp);
        }
    }
}