class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
         int n = s.length();
        boolean[] dp = new boolean[n];
        dp[0] = true;

        // counts how many positions in [i - maxJump, i - minJump] are reachable
        int reachableCount = 0;

        for (int i = 1; i < n; i++) {
            if (i >= minJump && dp[i - minJump])
                reachableCount++;

            if (i > maxJump && dp[i - maxJump - 1])
                reachableCount--;

            dp[i] = s.charAt(i) == '0' && reachableCount > 0;
        }

        return dp[n - 1];
    }
}