class Solution {
    public boolean canTransform(String start, String result) {
        int n = start.length();
        int i = 0, j = 0;

        // Traverse both strings
        while (i < n || j < n) {

            //  Skip all 'X' in start
            while (i < n && start.charAt(i) == 'X') {
                i++;
            }

            //  Skip all 'X' in result
            while (j < n && result.charAt(j) == 'X') {
                j++;
            }

            //  If both reach the end, transformation is possible
            if (i == n && j == n) return true;

            //  If only one reaches the end, it's invalid
            if (i == n || j == n) return false;

            char chStart = start.charAt(i);
            char chResult = result.charAt(j);

            //  Both non-'X' characters must match ('L' or 'R')
            if (chStart != chResult) return false;

            //  Check movement constraints:
            if (chStart == 'L' && i < j) return false; // 'L' can't move right
            if (chStart == 'R' && i > j) return false; // 'R' can't move left

          
            i++;
            j++;
        }
        return true;
    }
}