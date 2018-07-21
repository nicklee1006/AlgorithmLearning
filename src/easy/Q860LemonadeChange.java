package easy;

/**
 * 2018.7.21 Question 860. Lemonade Change
 * https://leetcode.com/problems/lemonade-change/description/
 *
 * At a lemonade stand, each lemonade costs $5.
 *
 * Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
 *
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the
 * correct change to each customer, so that the net transaction is that the customer pays $5.
 *
 * Note that you don't have any change in hand at first.
 *
 * Return true if and only if you can provide every customer with correct change.
 */
public class Q860LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int temp : bills) {
            if (temp == 5) {
                five++;
            } else if (temp == 10) {
                five--;
                ten++;
            } else if (temp == 20) {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five = five-3;
                }
            }

            if (five < 0) {
                return false;
            }
        }

        return true;
    }
}
