package medium;

import java.util.ArrayList;
import java.util.List;

public class Q228SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        List<String> results = new ArrayList<>();

        int start = nums[0];
        int end;

        for (int i = 0; i < nums.length - 1; i++) {
            // if current + 1 != next number
            if (nums[i] + 1 != nums[i + 1]) {
                end = nums[i];

                if (start != end) {
                    results.add(start + "->" + end);
                } else {
                    results.add(start + "");
                }

                // next number as start
                start = nums[i + 1];
            }
        }

        // need to consider the last number
        end = nums[nums.length - 1];
        if (start != end) {
            results.add(start + "->" + end);
        } else {
            results.add(start + "");
        }

        return results;
    }
}
