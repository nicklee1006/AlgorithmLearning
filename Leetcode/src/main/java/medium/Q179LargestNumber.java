package medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q179LargestNumber {
    public static String largestNumber(int[] nums) {
        Integer[] temp = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        Arrays.sort(temp, (o1, o2) -> {
            String s1 = o1 + "" + o2;
            String s2 = o2 + "" + o1;

            return s2.compareTo(s1);
        });

        String result =  Arrays.stream(temp).map(Object::toString).collect(Collectors.joining());

        return result.startsWith("0") ? "0" : result;
    }
}
