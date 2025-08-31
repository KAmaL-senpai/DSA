class Solution {
    public int singleNonDuplicate(int[] nums) {
      for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        // If all previous elements were in pairs, the last one is unique
        return nums[nums.length - 1];
    }
}