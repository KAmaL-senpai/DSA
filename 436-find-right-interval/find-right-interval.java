class Solution {
    public int[] findRightInterval(int[][] intervals) {
          HashMap<Integer, Integer> map = new HashMap<>();
        int[] first = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
            first[i] = intervals[i][0];
        }

        Arrays.sort(first);

        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int key = binarySearch(first, intervals[i][1]);
            if (key == first.length) {
                ans[i] = -1;
            } else if (key == 0) {
                if (intervals[i][1] <= first[0]) {
                    ans[i] = map.get(first[0]);
                } else {
                    ans[i] = 1;
                }
            } else {
                ans[i] = map.get(first[key]);
            }
        }
        return ans;
    }
     static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}