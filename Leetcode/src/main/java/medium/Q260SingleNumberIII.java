package medium;

import java.util.HashSet;
import java.util.Set;

public class Q260SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int num : nums) {
            if (temp.contains(num)) {
                temp.remove(num);
            } else {
                temp.add(num);
            }
        }

        int[] result = new int[2];
        int i = 0;
        for (Integer integer : temp) {
            result[i] = integer;
            i++;
        }

        return result;
    }
}
