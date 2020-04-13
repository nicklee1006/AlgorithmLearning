package medium;

import java.util.HashSet;
import java.util.Set;

public class Q287FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();

        for (int num : nums) {
            if (temp.contains(num)) {
                return num;
            }

            temp.add(num);
        }

        return -1;
    }
}
