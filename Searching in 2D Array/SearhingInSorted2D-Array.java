import java.util.Arrays;

public class Problem11 {
    /*
     * The search2dSortedArr function searches for a target in a row-wise sorted 2D
     * matrix using a modified binary search approach. It first reduces the number
     * of candidate rows to two by performing binary search on the middle column.
     * Then, it checks the middle elements of those two rows. If the target is not
     * found, the function divides the remaining matrix into four parts and performs
     * binary search in the most likely quadrant. This approach improves efficiency
     * over a brute-force scan.
     */
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 4, 5 },
                { 6, 7, 8, 9 },
                { 10, 11, 12, 14 }
        };
        int target = 14;
        System.out.println(Arrays.toString(search2dSortedArr(arr, target)));

    }

    static int[] binarySearch(int[][] mat, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (mat[row][mid] == target)
                return new int[] { row, mid };

            if (mat[row][mid] < target)
                cStart = mid + 1;
            else
                cEnd = mid - 1;

        }
        return new int[] { -1, -1 };
    }

    static int[] search2dSortedArr(int[][] arr, int target) {
        if (arr == null || arr.length == 0 || arr[0].length == 0)
            return new int[] { -1, -1 };
        int rows = arr.length;
        int cols = arr[0].length;

        // Error handling all row must have same colNum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length != cols) {
                throw new IllegalArgumentException("All rows must have the same number of columns");
            }
        }

        // Search using binary search if the only one row is present
        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Run the while loop till only 2 row are remaining;
        while (rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (arr[rMid][cMid] == target)
                return new int[] { rMid, cMid };

            if (arr[rMid][cMid] < target)
                rStart = rMid;
            else
                rEnd = rMid;
        }

        // now only 2 rows remain;
        // first search in the cMid
        // 1st row
        if (arr[rStart][cMid] == target)
            return new int[] { rStart, cMid };

        // 2nd row;
        if (arr[rStart + 1][cMid] == target)
            return new int[] { rStart + 1, cMid };

        // Now search in the fours half if not found in the cMid;
        // First half
        if (cMid - 1 >= 0 && target <= arr[rStart][cMid - 1])
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        // Second half
        if (cMid + 1 < cols && target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1])
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        // Third half
        if (cMid - 1 >= 0 && target <= arr[rStart + 1][cMid - 1])
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        // Fourth half
        if (cMid + 1 < cols && target >= arr[rStart + 1][cMid + 1] && target <= arr[rStart + 1][cols - 1])
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);

        return new int[] { -1, -1 };

    }
}
