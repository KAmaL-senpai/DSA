class Solution {
    public int[][] generateMatrix(int n) {
           int total = n * n;

        int[][] ans = new int[n][n];

        int top = 0;
        int left = 0;
        int right = ans[0].length-1;
        int bottom = ans.length - 1;

        int m = 1; 
        
        while (top <= bottom && left <= right && m <= total) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = m;
                m++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = m;
                m++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = m;
                    m++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = m;
                    m++;
                }
                left++;
            }
        }
        return ans;
    }
}