package medium;

public class Q75SortColors {
    public static void sortColors(int[] nums) {
        // elements before this are all '0'
        int zeroIndex = 0;
        // elements after this are all '2'
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
                // need to reduce this to check exchanged element
                i--;
            }
        }
    }
}
