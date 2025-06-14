class Solution {
    public int[] shuffle(int[] nums, int n) {
          int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            ans[count] = nums[i];
            ans[count + 1] = nums[n + i];
            count += 2;
        }
        return ans;
    }
}