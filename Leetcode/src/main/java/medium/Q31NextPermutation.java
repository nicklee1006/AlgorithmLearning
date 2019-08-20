package medium;

public class Q31NextPermutation {
    public static void nextPermutation(int[] nums) {
        int firstSmallerIndex = nums.length - 2;

        // find the first element that is smaller than it's right element
        while (firstSmallerIndex >= 0 && nums[firstSmallerIndex + 1] <= nums[firstSmallerIndex]) {
            firstSmallerIndex--;
        }

        // whole array descending, reverse everything
        if (firstSmallerIndex == -1) {
            reverse(nums, 0);
            return;
        }

        // from firstSmallerIndex -> nums.length - 1, it's guaranteed to be in descending order
        // find the index that is just bigger than firstSmallerIndex
        int j = nums.length - 1;
        while (j >= 0 && nums[j] <= nums[firstSmallerIndex]) {
            j--;
        }

        // swap firstSmallerIndex and j
        swap(nums, firstSmallerIndex, j);

        // reverse elements to the right of firstSmallerIndex
        reverse(nums, firstSmallerIndex + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
