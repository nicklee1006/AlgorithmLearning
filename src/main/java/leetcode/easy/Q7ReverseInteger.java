package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2018.3.16 Question 7: Reverse Integer
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class Q7ReverseInteger {
    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int mod = x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && mod > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && mod < -8)) {
                return 0;
            }

            result = result * 10 + mod;
        }

        return result;
    }

    /**
     * Using queue
     */
//    public static int reverse(int x) {
//        Queue<Integer> queue = new LinkedList<>();
//
//        // push each digit to stack
//        while (x != 0) {
//            queue.offer(x % 10);
//
//            x = x / 10;
//        }
//
//        // Restore digit
//        int result = 0;
//        while (!queue.isEmpty()) {
//            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && queue.peek() > 7)) {
//                return 0;
//            }
//            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && queue.peek() < -8)) {
//                return 0;
//            }
//
//            result = result * 10 + queue.poll();
//        }
//
//        return result;
//    }

    /**
     * 1. check if it is < 0
     *  1.1 if < 0, remove '-', keep a record
     * 2. convert to string, and reverse it
     * 3. remove '0' at the beginning
     * 4. add back '-' if necessary
     * 5. check if it > MAX_VALUE or < MIN_VALUE
     */
//    public static int reverse(int x) {
//        String numberString = String.valueOf(x);
//
//        // process negative
//        if (numberString.startsWith("-")) {
//            numberString = numberString.substring(1);
//
//            StringBuilder builder = new StringBuilder();
//            builder.append(numberString);
//            builder.reverse();
//
//            numberString = builder.toString();
//
//            while (numberString.startsWith("0")) {
//                numberString = numberString.substring(1);
//            }
//
//            numberString = "-" + numberString;
//
//            long result = Long.parseLong(numberString);
//
//            if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
//                return 0;
//            } else {
//                return (int) result;
//            }
//        } else {
//            StringBuilder builder = new StringBuilder();
//            builder.append(numberString);
//            builder.reverse();
//
//            numberString = builder.toString();
//
//            while (numberString.startsWith("0")) {
//                numberString = numberString.substring(1);
//            }
//
//            if (numberString.equals("")) {
//                numberString = "0";
//            }
//
//            long result = Long.parseLong(numberString);
//
//            if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
//                return 0;
//            } else {
//                return (int) result;
//            }
//        }
//    }
}
