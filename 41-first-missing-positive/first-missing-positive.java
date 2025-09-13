class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for (int i = 0; i < nums.length;) {
            int correctInd = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctInd]) {
                int temp = nums[i];
                nums[i] = nums[correctInd];
                nums[correctInd] = temp;
            } else {
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length+1;

    }
}