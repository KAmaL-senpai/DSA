class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat, target)) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if (Arrays.deepEquals(rotate90(mat), target)) {
                return true;
            }
            mat=rotate90(mat);
        }
        return false;
    }
    
     public int[][] rotate90(int[][] arr) {
        int[][] ans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ans[j][arr.length - 1 - i] = arr[i][j];
            }
        }

        return ans;
    }
}