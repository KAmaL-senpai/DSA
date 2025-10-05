class Solution {
    public int[][] merge(int[][] intervals) {
         int n = intervals.length;
        if (n == 0)
            return new int[0][];

        // sort by start index
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // If ans is empty or current start is greater than last end → no overlap
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(intervals[i]);
            } else {
                // Overlapping: merge with the last interval
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}