package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 2018.6.14 Question 575: Distribute Candies
 * https://leetcode.com/problems/distribute-candies/description/
 *
 * Given an integer array with even length, where different numbers in this array represent different kinds of
 * candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally
 * in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 *
 * Solution
 * 1. find how many kind of candy, using set
 * 2. compare #kinds and total candy,
 *  2.1 If #kinds < candy/2, means each kind of candy has at least 2, they can have all kinds of candy
 */
public class Q575DistributeCandies {
    public static int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();

        for (int temp : candies) {
            kinds.add(temp);
        }

        if (kinds.size() >= candies.length / 2) {
            return candies.length / 2;
        } else {
            return kinds.size();
        }
    }
}
