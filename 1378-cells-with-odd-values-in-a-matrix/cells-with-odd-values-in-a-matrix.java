class Solution {
    public int oddCells(int m, int n, int[][] indices) {
          int[] row = new int[m];
        int[] col = new int[n];

        for (int[] arr : indices) {

            row[arr[0]]++;
            col[arr[1]]++;

        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cellValue = row[i] + col[j];
                if (cellValue % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}