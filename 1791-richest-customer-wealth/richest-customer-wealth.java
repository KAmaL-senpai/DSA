class Solution {
    public int maximumWealth(int[][] accounts) {
         int ans=Integer.MIN_VALUE;
        for (int[] arr : accounts) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}