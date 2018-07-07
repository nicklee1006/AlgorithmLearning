package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2018.7.7 Question 762. Prime Number of Set Bits in Binary Representation
 * Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a
 * prime number of set bits in their binary representation.
 *
 * (Recall that the number of set bits an integer has is the number of 1s present when written in
 * binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.)
 */
public class Q762PrimeNumberOfSetBitsInBinaryRepresentation {
    public static int countPrimeSetBits(int L, int R) {
        Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

        int result = 0;

        for (int i = L; i <= R; i++) {
            if (primes.contains(Integer.bitCount(i))) {
                result++;
            }
        }

        return result;
    }
}
