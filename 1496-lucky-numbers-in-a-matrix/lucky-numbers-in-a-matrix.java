class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            int minColIndex = 0;
            int minVal = matrix[i][0];

            // Finding min in row
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minColIndex = j;
                }
            }

         
            boolean isMaxinCol = true;

            // Finding min in col
            for (int k = 0; k < row; k++) {
                if (matrix[k][minColIndex] > minVal) {
                    isMaxinCol = false;
                    break;
                }
            }

            if (isMaxinCol) {
                list.add(minVal);
            }
        }

        return list;
    }
}