package medium;

public class Q75SortColors {
    public static void sortColors(int[] nums) {
        int zeroIndex = 0;
        int twoIndex = nums.length - 1;

        for (int i = 0; i <= twoIndex; i++) {
            if (nums[i] == 0) {
                // exchange zeroIndex with i
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;

                zeroIndex++;
            } else if (nums[i] == 2) {
                // exchange twoIndex with i
                int temp = nums[twoIndex];
                nums[twoIndex] = nums[i];
                nums[i] = temp;

                twoIndex--;
                i--;
            }
        }
    }
}
