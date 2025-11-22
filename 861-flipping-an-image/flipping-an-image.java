class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for (int[] row : arr) {
            int n = row.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                // swap and invert in one step
                int temp = row[i] ^ 1; // invert
                row[i] = row[n - i - 1] ^ 1; // invert
                row[n - i - 1] = temp;
            }
        }
        return arr;
    }
}