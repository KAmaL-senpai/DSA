class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int srow = 0, scol = 0, erow = ans.length - 1, ecol = ans[0].length - 1;
        int count = 1;

        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                ans[srow][i] = count;
                count++;
            }
            srow++;
            for (int i = srow; i <= erow; i++) {
                ans[i][ecol] = count;
                count++;
            }
            ecol--;
            if (srow <= erow) {

                for (int i = ecol; i >= scol; i--) {
                    ans[erow][i] = count;
                    count++;
                }
                erow--;
            }
            if (scol <= ecol) {

                for (int i = erow; i >= srow; i--) {
                    if (scol == ecol) {
                        break;
                    }
                    ans[i][scol] = count;
                    count++;
                }
                scol++;
            }
        }
        return ans;

    }
}