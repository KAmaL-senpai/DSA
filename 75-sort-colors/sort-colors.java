 /**
     * This method sorts an array containing only 0s, 1s, and 2s in a single pass
     * using the Dutch National Flag algorithm. It uses three pointers:
     *
     * - 'i' points to the boundary where the next 0 should go,
     * - 'j' points to where the next 2 should go,
     * - 'mid' is the current element being checked.
     *
     * The algorithm works by scanning through the array once:
     * - If the current number is 0, it's swapped with the front ('i') and both
     * pointers move forward.
     * - If it's 1, it's already in the correct position, so only 'mid' moves
     * forward.
     * - If it's 2, it's swapped with the back ('j'), and only 'j' moves backward
     * (mid is rechecked).
     *
     * This approach is efficient (O(n) time, O(1) space) and doesn't require extra
     * memory or sorting functions.
     */
class Solution {
    public void sortColors(int[] nums) {
          int i = 0;
        int mid = 0;
        int j = nums.length - 1;
        while (mid <= j) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[i];
                nums[i] = temp;
                i++;
                mid++;

            } else if (nums[mid] == 1) {
                mid++;

            } else {
                int temp = nums[mid];
                nums[mid] = nums[j];
                nums[j] = temp;
                j--;

            }
        }
    }
}