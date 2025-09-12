class Solution {
    public int findDuplicate(int[] nums) {
      for (int i = 0; i < nums.length;) {
            if (nums[i] != i + 1) {
                int correctInd = nums[i] - 1;
                if (nums[i] != nums[correctInd]) {
                    int temp = nums[i];
                    nums[i] = nums[correctInd];
                    nums[correctInd] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}