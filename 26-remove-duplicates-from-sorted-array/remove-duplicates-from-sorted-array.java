class Solution {
    public int removeDuplicates(int[] nums) {
         int i = 0;
        for (int j = 0; j < nums.length; j++) {  //two-pointer method
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}