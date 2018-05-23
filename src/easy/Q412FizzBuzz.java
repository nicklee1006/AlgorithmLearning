package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.5.23 Question 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/description/
 *
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of
 * five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class Q412FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if ((i+16) % 15 == 0) {
                results.add("FizzBuzz");
            } else if ((i+16) % 3 == 0) {
                results.add("Fizz");
            } else if ((i+16) % 5 == 0) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i+1));
            }
        }

        return results;
    }
}
