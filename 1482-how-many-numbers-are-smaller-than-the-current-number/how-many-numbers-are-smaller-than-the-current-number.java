class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int[] res = new int[nums.length];

        int[] bucketArr = new int[101];
        for (int num : nums) {
            bucketArr[num]++;
        }
        
        
        for (int i = 1; i < bucketArr.length; i++) {
            bucketArr[i] += bucketArr[i - 1];
        }
        
        for (int i = 0; i < res.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = bucketArr[nums[i] - 1];
            }
        }
        return res;

    }
}