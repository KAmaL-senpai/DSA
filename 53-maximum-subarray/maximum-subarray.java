class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = nums[0];
        int total = 0;
        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }
            total += n;
            maxSum = total > maxSum ? total : maxSum;
        }
        return maxSum;

    }
}