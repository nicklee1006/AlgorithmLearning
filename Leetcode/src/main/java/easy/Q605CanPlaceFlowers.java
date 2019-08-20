package easy;

/**
 * 2018.6.18 QUestion 605. Can Place Flowers
 * https://leetcode.com/problems/can-place-flowers/description/
 *
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. However,
 * flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 *
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
 * and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 *
 * Note:
 * The input array won't violate no-adjacent-flowers rule.
 * The input array size is in the range of [1, 20000].
 * n is a non-negative integer which won't exceed the input array size.
 *
 * Solution
 * 1. count the valid place
 * 2. check prev and next, if both are 0, then can plant in this index i
 */
public class Q605CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int result = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                // see if prev and next is 0
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == flowerbed.length-1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    result++;
                }
            }
        }

        return result >= n;
    }
}
