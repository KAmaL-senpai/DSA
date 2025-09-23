class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int closeSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int possibleAns = Math.abs(sum - target);
                if (possibleAns == 0)
                    return sum;
                if (possibleAns < min) {
                    min = possibleAns;
                    closeSum = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closeSum;
    }
}