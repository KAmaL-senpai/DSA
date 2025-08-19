class Solution {
    public int splitArray(int[] nums, int k) {
         int start = 0;
        int end = 0;

        // Initialize the binary search bounds
        for (int num : nums) {
            start = Math.max(start, num); // at least the largest number
            end += num;                   // at most the total sum
        }

        // Binary search to minimize the largest subarray sum
        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // Need a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1; // Too many pieces, increase allowed max sum
            } else {
                end = mid; // Valid split, try a smaller max sum
            }
        }

        return start;
    }
}