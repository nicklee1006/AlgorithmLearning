package easy;

/**
 * 2018.5.3 Question 203: Count Primes
 * https://leetcode.com/problems/count-primes/description/
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * hint: Sieve of Eratosthenes method
 * https://www.geeksforgeeks.org/sieve-of-eratosthenes/
 *
 * Solution
 * 1. Use an array a to indicate 1 - n, not prime
 * 2. 2 for loop (i, j),  mark a[k] not prime, if k = i*j (i, j from 2 - n)
 */
public class Q204CountPrimes {
    public static int countPrimes(int n) {
        // use the array to indicate if a number (from 1 - n) is a prime
        boolean[] notPrime = new boolean[n];

        int count = 0;

        if (n < 2) {
            return 0;
        }

        // 0 and 1 are not prime
        notPrime[0] = true;
        notPrime[1] = true;

        // here use 2-loop, if mark (i*j) as not prime
        for (int i = 2; i < n; i++) {
            for (int j = 2; i * j < n; j++) {
                if (!notPrime[i * j]) {
                    notPrime[i * j] = true;
                }
            }
        }

        for (boolean isPrime : notPrime) {
            if (!isPrime) {
                count++;
            }
        }

        return count;
    }
}
