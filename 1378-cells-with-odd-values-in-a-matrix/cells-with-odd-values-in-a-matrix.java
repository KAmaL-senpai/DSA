class Solution {
    public int oddCells(int m, int n, int[][] indices) {
         int[] row = new int[m];
        int[] col = new int[n];

        for (int[] x : indices) {
            row[x[0]] ^= 1;
            col[x[1]] ^=1;
        }

        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));
        int odd=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((row[i] + col[j])%2 !=0){
                    odd++;
                }
            }
        }
        return odd;
    }
}

