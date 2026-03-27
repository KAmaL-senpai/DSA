class Solution {
    
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int n, int count) {
        if (n == 0)
            return count;
        boolean isEven = n % 2 == 0;
        if (isEven) {
            return helper(n / 2, count+1);
        }
        return helper(n - 1, count+1);

    }
}