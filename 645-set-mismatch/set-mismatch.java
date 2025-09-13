class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length;) {
            int correctInd = nums[i] - 1;
            if (nums[i] != nums[correctInd]) {
                int temp = nums[i];
                nums[i] = nums[correctInd];
                nums[correctInd] = temp;
            } else {
                i++;
            }
        }
        for (int i = 0; i < nums.length;) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i];
                ans[1] = i + 1;
                break;
            } else {
                i++;
            }
        }
 
        return ans;
    }
}