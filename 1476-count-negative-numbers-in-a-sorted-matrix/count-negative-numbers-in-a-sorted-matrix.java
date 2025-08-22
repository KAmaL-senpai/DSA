class Solution {
    public int countNegatives(int[][] grid) {
         int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int row = n - 1;
        int col = 0;
        while (row >= 0 && col < m) {
            if (grid[row][col] < 0) {

                row--;
                count += m - col;
            } else {

                col++;
            }
        }
        return count;
    }
}