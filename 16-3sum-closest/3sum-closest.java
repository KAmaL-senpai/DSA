class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int closestSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int possibleAns = Math.abs(sum - target);

                    if (possibleAns == 0) {
                        return sum; // Perfect match found
                    }

                    if (possibleAns < min) {
                        min = possibleAns;
                        closestSum = sum;
                    }
                }
            }
        }

        return closestSum;
    }
}