class Solution {
    public int findNumbers(int[] nums) {
         int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            int length = str.length();
            if (length % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}