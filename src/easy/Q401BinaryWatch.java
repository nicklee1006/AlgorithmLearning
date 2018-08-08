package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.5.22 Question 401. Binary Watch
 * https://leetcode.com/problems/binary-watch/description/
 *
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom
 * represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the right.
 *
 * Given a non-negative integer n which represents the number of LEDs that are currently on, return all
 * possible times the watch could represent.
 *
 * Note:
 * The order of output does not matter.
 * The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 * The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not
 * valid, it should be "10:02".
 *
 * Solution
 * 1. 2 loops
 * 2. first for hours
 * 3. second for minutes
 * 4. if binary representation of hours + minutes = bitcount of num, add to result
 */
public class Q401BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == num) {
                    times.add(String.format("%d:%02d", i, j));
                }
            }
        }

        return times;
    }
}
